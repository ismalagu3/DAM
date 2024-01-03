package com.ilagunilla.psp01;

/**
 *
 * @author ismal
 */
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {

    public static void main(String[] args) {
        ordenarNumeros();
    }

    public static void ordenarNumeros() {
        //usamos la clase scanner para poder recopilar la información escrita por el usuario
        Scanner scanner = new Scanner(System.in);

        //Cantidad de números en total que se van a introducir
        System.out.print("Cuántos número va a ingresar?");
        int cantidad = scanner.nextInt();
        
        //validamos que los números sean positivos
        if(cantidad>0){
            //declaramos el array que contendrá los números
            int[] numeros = new int[cantidad];
            //bucle con el que recogemos los números escritos en consola
            for(int i=cantidad;i>0;i--){
                System.out.print("Ingrese número: ");
                int numero = scanner.nextInt();            
                cantidad--;
                numeros[cantidad] = numero;
            }

            //ordenamos los números de menor a mayor
            Arrays.sort(numeros);

            //mostramos los números ordenados por consola
            for(int i : numeros){
                System.out.print(i + " ");
            }
        }
    }
}

