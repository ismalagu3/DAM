package com.ilagunilla.prog04_ejerc1;

import java.util.Scanner;

/**
 *
 * @author ismal
 */
public class PROG04_Ejerc1 {

    public static void main(String[] args) {
        
        System.out.println("Introduce un número menor a 30: ");
        Scanner scanner = new Scanner(System.in);
        
        int valor = scanner.nextInt();
        
        if(valor < 30){
            System.out.println("While: ");
            int i=10;
            while(i>=0){
                System.out.println(valor + " * " + i + " = " + valor*i);
                i--;
            }
            
            System.out.println("Do-while: ");
            int j=0;
            do{
                System.out.println(valor + " * " + j + " = " + valor*j);
                j++;
            }while(j<=10);
            
            System.out.println("For: ");
            for(int k=0; k<=10; k++){
                System.out.println(valor + " * " + k + " = " + valor*k);
            }
        } else{
            System.err.println("El número es mayor que 30");
        }
    }
}
    