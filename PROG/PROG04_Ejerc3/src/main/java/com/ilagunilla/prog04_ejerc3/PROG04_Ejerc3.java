/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ilagunilla.prog04_ejerc3;

import java.util.Scanner;

/**
 *
 * @author ismal
 */
public class PROG04_Ejerc3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número positivo: ");
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            int mcm = calcularMCM(num1, num2);
            System.out.println("El Mínimo Común Múltiplo (MCM) de " + num1 + " y " + num2 + " es: " + mcm);
        } else {
            System.out.println("Ambos números deben ser positivos. El programa ha finalizado.");
        }
    }

    private static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

    private static int calcularMCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

