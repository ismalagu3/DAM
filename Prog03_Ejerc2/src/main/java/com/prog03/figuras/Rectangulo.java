package com.prog03.figuras;

public class Rectangulo {
    int base;
    int altura;
        
    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    float getArea(){
        return this.altura * this.base;
    }
    
    @Override
    public String toString(){
        return "El area es: " + getArea() + " , y la altura es: " + getAltura();
    }
    
    public boolean isCuadrado(){
        return (getAltura() != getBase())?true:false;
    }
}
