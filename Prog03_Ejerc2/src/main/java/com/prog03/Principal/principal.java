package com.prog03.Principal;
import com.prog03.figuras.Rectangulo;

public class principal {
    
    public static void main (String[] args){
        Rectangulo rect1 = new Rectangulo();
        
        rect1.setBase(10);
        rect1.setAltura(13);
        
        System.out.println(rect1.isCuadrado());
        
        
        Rectangulo rect2 = new Rectangulo();
        
        rect2.setBase(7);
        rect2.setAltura(5);
        
        System.out.println(rect2.toString());
    }
}
