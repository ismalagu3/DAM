package com.ilagunilla.prog04_ejerc2;

import java.util.Scanner;

/**
 *
 * @author ismal
 */
public class PROG04_Ejerc2 {

    public static void main(String[] args) {
        System.out.println("Inserta 5 números: ");
        Scanner scanner = new Scanner(System.in);
        
        int i=5;
        
        do{
            int numero = scanner.nextInt();
            if(numero < 0) {
                System.out.println("El número es negativo");
            } else if(numero!=2 && numero%2==0){
                System.out.println("El número no es primo");
            } else{
               boolean esPrimo = true;
                for (int j = 3; j * j <= numero; j += 2) {
                    if (numero % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println("El número es primo");
                } else {
                    System.out.println("El número no es primo");
                }
            }
           i--;
        }while(i>0); 
    }
}
