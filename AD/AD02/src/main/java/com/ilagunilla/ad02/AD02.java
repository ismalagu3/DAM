package com.ilagunilla.ad02;

/**
 *
 * @author ismal
 */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AD02 {

    // Definición de la estructura de cada registro
    private static final int TAMANO_REGISTRO = 100; // ajustar según la longitud de los campos

    // Definición de los campos del registro
    private static final int TAMANO_CODIGO = 4; // tamaño en bytes para el campo CODIGO (int)
    private static final int TAMANO_NOMBRE = 20; // tamaño en bytes para el campo NOMBRE (string)
    private static final int TAMANO_DIRECCION = 30; // tamaño en bytes para el campo DIRECCION (string)
    private static final int TAMANO_SALARIO = 4; // tamaño en bytes para el campo SALARIO (float)
    private static final int TAMANO_COMISION = 4; // tamaño en bytes para el campo COMISION (float)

    public static void main(String[] args) {
        // Ejemplo con cinco empleados
        Empleado[] empleados = {
                new Empleado(1, "Juan", "Calle 123", 50000.0f, 0.05f),
                new Empleado(2, "Ana", "Avenida 456", 60000.0f, 0.08f),
                new Empleado(3, "Carlos", "Plaza 789", 55000.0f, 0.07f),
                new Empleado(4, "Elena", "Carrera 321", 70000.0f, 0.1f),
                new Empleado(5, "Pedro", "Paseo 654", 48000.0f, 0.03f)
        };

        // Escribir los empleados en el fichero
        escribirEmpleadosEnFichero(empleados, "EMPLEADOS.DAT");
    }

    // Método para escribir los empleados en el fichero
    private static void escribirEmpleadosEnFichero(Empleado[] empleados, String nombreFichero) {
        try {
            // Crear o abrir el fichero en modo lectura/escritura
            RandomAccessFile fichero = new RandomAccessFile(new File(nombreFichero), "rw");

            for (Empleado empleado : empleados) {
                // Escribir cada campo del empleado en el fichero
                fichero.writeInt(empleado.getCodigo());
                escribirCadena(fichero, empleado.getNombre(), TAMANO_NOMBRE);
                escribirCadena(fichero, empleado.getDireccion(), TAMANO_DIRECCION);
                fichero.writeFloat(empleado.getSalario());
                fichero.writeFloat(empleado.getComision());
            }

            // Cerrar el fichero
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para escribir una cadena en el fichero con un tamaño específico
    private static void escribirCadena(RandomAccessFile fichero, String cadena, int tamano) throws IOException {
        // Asegurar que la cadena tenga el tamaño correcto
        StringBuilder sb = new StringBuilder(cadena);
        sb.setLength(tamano);
        fichero.writeChars(sb.toString());
    }

    // Clase que representa un empleado
    private static class Empleado {
        private int codigo;
        private String nombre;
        private String direccion;
        private float salario;
        private float comision;

        public Empleado(int codigo, String nombre, String direccion, float salario, float comision) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.direccion = direccion;
            this.salario = salario;
            this.comision = comision;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public float getSalario() {
            return salario;
        }

        public float getComision() {
            return comision;
        }
    }
}
