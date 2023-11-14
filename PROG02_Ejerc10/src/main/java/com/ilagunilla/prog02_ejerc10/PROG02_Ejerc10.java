package com.ilagunilla.prog02_ejerc10;

public class PROG02_Ejerc10 {

    public static void main(String[] args) {
        
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j = i * x;
        double dx = 2.0;
        double dz= dx * y;
        byte bx = 5;
        byte by = 2;
        byte bz = bx - by;
        bx = -128;
        by = 1;
        bz = (byte) (bx - by);
        bz =(int) (bx - by);
        short sx = 5;
        short sy = 2;
        short sz = sx - sy;
        sx = 32767;
        sy = 1;
        sz = sx + sy;
        char cx = \u000F;
        char cy = \u0001;
        int z = cx - cy;
        z = cx - 1;
        cx = \uFFFF;
        z = cx;
        sx = cx;
        sx= -32768;
        cx = sx;
        z = sx;
        sx = -1;
        cx = sx;
        z = cx;

    }
}
