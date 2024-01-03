package com.ilagunilla.psp01;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ismal
 */
public class lenguaje {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int longitudConjunto = scanner.nextInt(); 
        String nombreArchivo = scanner.nextLine();
        String conjuntoAleatorio = generarConjuntoAleatorio(longitudConjunto);
        System.out.println(conjuntoAleatorio);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(conjuntoAleatorio + "\n");
        } catch (Exception e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
        
        System.out.print("Se van a almacenar " + longitudConjunto + "caracteres en el fichero" + nombreArchivo);
    }
    
    private static String generarConjuntoAleatorio(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random random = new Random();
        StringBuilder conjunto = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            conjunto.append(caracterAleatorio);
        } 
        return conjunto.toString();
        }
}
