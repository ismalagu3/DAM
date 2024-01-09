package com.ilagunilla.prog04_ejerc4;

import java.util.Scanner;

/**
 *
 * @author ismal
 */
public class PROG04_Ejerc4 {

    public static void main(String[] args) {
        int opcion;
        int numInt = 5;
        int numMax = 10;
        int numero = 0;
        int intentos = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("1. Configurar, 2. Jugar, 3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Inserte el número de intentos");
                    numInt = scanner.nextInt();
                    System.out.println("Inserte el número máximo a generar");
                    numMax = scanner.nextInt();
                    break;
                case 2:
                    int numOculto = (int)Math.floor(Math.random()*numMax);
                    System.out.println("Empieza el juego, diga el primer número: ");
                    while(numInt>0 && numero!=numOculto){
                        numero = scanner.nextInt();                        
                        intentos++;
                        
                        if(numero<numOculto){
                            System.out.println("El número oculto es mayor");
                        }
                        
                        if(numero>numOculto){
                            System.out.println("El número oculto es menor");
                        }
                        
                        if(numero==numOculto){
                            System.out.println("Has ganado!. Has necesitado " + intentos + " intentos");
                            break;
                        }
                        numInt--;
                    }
                    if(numInt == 0 && numero != numOculto){                        
                        System.out.println("Perdiste!. Intentos consumidos");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }
}
