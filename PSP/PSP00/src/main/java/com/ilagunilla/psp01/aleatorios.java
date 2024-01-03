package com.ilagunilla.psp01;

/**
 *
 * @author ismal
 */
public class aleatorios {

    public static void main(String[] args) {
        
        //creamos un bucle que se ejecute 100 veces
        for(int i=0;i<100;i++){
            
            /*
                Generamos un entero que contendrá los números aleatorios
                Se generan primero en tipo float (Math.random()) y posteriormente se pasan a enteros Math.floor(Math.random())
            */
            int random = (int)Math.floor(Math.random()*100);
            System.out.print(random + " ");
        }
    }
}
