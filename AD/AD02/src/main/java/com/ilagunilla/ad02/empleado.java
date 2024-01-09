package com.ilagunilla.ad02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ismal
 */
public class empleado {
        
    public static class crearEmpleado{
        
        int CODIGO;
        String NOMBRE;
        String DIRECCION;
        float SALARIO;
        float COMISION;
        
        public crearEmpleado(int CODIGO, String NOMBRE, String DIRECCION, float SALARIO, float COMISION){
            this.CODIGO=CODIGO;  
            this.NOMBRE=NOMBRE;  
            this.DIRECCION=DIRECCION;  
            this.SALARIO=SALARIO;  
            this.COMISION=COMISION;  
        } 
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        try{
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("EMPLEADOS.DAT"));

            crearEmpleado empleado1 = new crearEmpleado(1, "Pedro", "Madrid", 1000, 0.5f);
            crearEmpleado empleado2 = new crearEmpleado(2,"María","Murcia",1700,9);
            crearEmpleado empleado3 = new crearEmpleado(3,"Amparo","Valencia",1600,7);
            crearEmpleado empleado4 = new crearEmpleado(4,"José","Barcelona",1560,8);
            crearEmpleado empleado5 = new crearEmpleado(5,"Alfonso","Sevilla",1670,10);

            archivo.writeObject(empleado1);
            archivo.writeObject(empleado2);
            archivo.writeObject(empleado3);
            archivo.writeObject(empleado4);
            archivo.writeObject(empleado5);

            archivo.close();

            FileInputStream filearchivo = new FileInputStream("EMPLEADOS.DAT");
            ObjectInputStream leerarchivo = new ObjectInputStream(filearchivo);
                       
            ArrayList codigoArray = new ArrayList();
            ArrayList comisionArray = new ArrayList();
            ArrayList direccionArray = new ArrayList();
            ArrayList nombreArray = new ArrayList();
            ArrayList salarioArray = new ArrayList();
            
            while( filearchivo.available() > 0){
                crearEmpleado leer = (crearEmpleado)leerarchivo.readObject();

                 System.out.println("\nCodigo: " + leer.CODIGO); 
                 System.out.println("Comision: " +leer.COMISION); 
                 System.out.println("Direccion: " +leer.DIRECCION); 
                 System.out.println("Nombre: " +leer.NOMBRE); 
                 System.out.println("Salario: " +leer.SALARIO); 

                 codigoArray.add(leer.CODIGO);
                 comisionArray.add(leer.COMISION);
                 direccionArray.add(leer.DIRECCION);
                 nombreArray.add(leer.NOMBRE);
                 salarioArray.add(leer.SALARIO);
         }
            
        } catch (IOException IOe) {        
            System.out.println(IOe); 
         
        }
    }

    
}

//CODIGO (int), NOMBRE (string), DIRECCION (string), SALARIO (float) y COMISION (float)