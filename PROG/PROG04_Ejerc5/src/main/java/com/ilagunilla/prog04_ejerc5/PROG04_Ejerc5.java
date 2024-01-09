package com.ilagunilla.prog04_ejerc5;

import java.util.Scanner;
/**
 *
 * @author ismal
 */
public class PROG04_Ejerc5 {

    public static void main(String[] args) {
        int dividendo = 0;
        int divisor = 0;
        int divisiones=0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(dividendo!=-1 && divisor!=-1){
            System.out.println("Inserta 2 valores, el primero será el dividendo y el segundo el divisor");
            dividendo = scanner.nextInt();
            divisor = scanner.nextInt();
            try{
                System.out.println("El resultado de la división es: " + dividendo/divisor);
                divisiones++;
            }catch(ArithmeticException e){
                System.out.println("Error: No se puede dividir entre cero. Intente de nuevo.");
            }
        }
        System.out.println("Salimos del programa");
    }
}