package com.ilagunilla.prog02_ejerc9;

public class PROG02_Ejerc9 {

    public static void main(String[] args) {
        int año = 1900;
        
        boolean bisiesto = ((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0);
        System.out.println("¿Es bisiesto el año " + año + "?: " + bisiesto);
    }
}
