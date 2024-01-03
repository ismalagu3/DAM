package com.ilagunilla.psp01;

import java.util.Scanner;

public class ProgHijo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pregunta;
        while (true) {
            try {
                // Leer la pregunta desde el proceso padre
                pregunta = scanner.nextLine();
                
                // Procesar la pregunta y enviar la respuesta
                String respuesta = procesarPregunta(pregunta);
                System.out.println(respuesta);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String procesarPregunta(String pregunta) {
        switch (pregunta) {
            case "¿Cómo estás?":
                return "Estoy bien";
            case "¿Cuántos años tienes?":
                return "18 años";
            case "¿Eres el proceso hijo?":
                return "Si";
            case "¿Cuál es tu PID?":
                return Thread.currentThread().getName() + " PID del proceso hijo.";
            case "FIN":
                System.exit(0);
            default:
                return "No entiendo tu pregunta";
        }
    }
}
