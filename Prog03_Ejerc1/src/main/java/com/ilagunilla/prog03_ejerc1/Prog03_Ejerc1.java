package com.ilagunilla.prog03_ejerc1;

public class Prog03_Ejerc1 {

    public static void main(String[] args) {        
        Fecha objFecha1 = new Fecha(Fecha.enumMes.SEPTIEMBRE);
        
        objFecha1.setDia(14);
        objFecha1.setAnno(2023);
        
        System.out.println("Primera fecha, inicializada con el primer constructor");
        System.out.println(objFecha1.toString());
        System.out.println((objFecha1.isSummer()!=true?"No es verano":"Es verano"));
        
        
        Fecha objFecha2;
        System.out.println("\nSegunda fecha, inicializada con el segundo constructor");
        objFecha2 = new Fecha(Fecha.enumMes.AGOSTO);
        System.out.println("La fecha 2 contiene el año: " + objFecha2.anno);
        System.out.println("La fecha es: " + objFecha2.toString());
        System.out.println((objFecha2.isSummer()!=true?"No es verano":"Es verano"));
        
    }
}
