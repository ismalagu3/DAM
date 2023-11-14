package com.ilagunilla.prog02_ejerc8;

public class PROG02_Ejerc8 {

    public static void main(String[] args) {
        int alumPROG = 32;
        int alumED = 56;
        int alumBD = 98;
        
        float total = alumPROG + alumED +  alumBD;
        
        System.out.println("% Alumnos de Programación: " + String.format("%.1f", alumPROG*100/total));
        System.out.println("% Alumnos de Entornos de Desarrollo: " + String.format("%.1f", alumED*100/total));
        System.out.println("% Alumnos de Bases de Datos: " + String.format("%.1f", alumBD*100/total));
    }
}
