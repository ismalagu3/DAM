package com.ilagunilla.prog02_ejerc6;

public class PROG02_Ejerc6 {
    
    public static void main(String[] args) {

        enum razaPerro {
            Mastin,
            Terrier,
            Bulldog,
            Pekines,
            Caniche,
            Galgo
        }

        razaPerro var1 = razaPerro.Bulldog;
        System.out.println(var1);
        
        razaPerro var2 = razaPerro.Caniche;
        System.out.println(var2);
        
        System.out.println("¿Tienen el mismo valor las 2 variables?: " + (var1 == var2));
        
        System.out.println("Posición de la variable 1: " + var1.ordinal());
        System.out.println("Posición de la variable 2: " + var2.ordinal());
        
        System.out.println("Número de razas de perro: " + razaPerro.values().length);
    }
}