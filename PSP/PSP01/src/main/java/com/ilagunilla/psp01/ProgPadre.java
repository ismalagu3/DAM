package com.ilagunilla.psp01;

/**
 *
 * @author ismal
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ProgPadre {
    public static void main(String[] args) {
        try {
            // Crear proceso hijo
            Process hijo = Runtime.getRuntime().exec("java ProgHijo");

            // Establecer comunicación con el proceso hijo
            BufferedReader input = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
            PrintWriter output = new PrintWriter(new OutputStreamWriter(hijo.getOutputStream()), true);

            // Preguntas y respuestas
            String[] preguntas = {"¿Cómo estás?", "¿Cuántos años tienes?", "¿Eres el proceso hijo?", "¿Cuál es tu PID?"};
            for (String pregunta : preguntas) {
                System.out.println("Pregunta: " + pregunta);
                output.println(pregunta);

                // Leer y mostrar la respuesta
                String respuesta = input.readLine();
                System.out.println("Respuesta: " + respuesta);
            }

            // Preguntar otras cosas
            System.out.println("Pregunta: Otra pregunta");
            output.println("Otra pregunta");
            String respuesta = input.readLine();
            System.out.println("Respuesta: " + respuesta);

            // Terminar la comunicación
            output.println("FIN");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
