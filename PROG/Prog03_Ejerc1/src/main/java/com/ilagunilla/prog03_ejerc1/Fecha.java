package com.ilagunilla.prog03_ejerc1;

public class Fecha {
    public enum enumMes {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
    }

    int dia;
    enumMes mes;
    int anno;

    public Fecha(enumMes mes) {
        this.dia = 0;
        this.mes = mes;
        this.anno = 0;
    }
    
    public Fecha(int dia, enumMes mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public enumMes getMes() {
        return mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public boolean isSummer(){
        return mes.ordinal() >= enumMes.JUNIO.ordinal() && mes.ordinal() <= enumMes.SEPTIEMBRE.ordinal();
    }

    public String toString (){
        String fecha = new String();
        fecha = this.dia + " de " + this.mes + " de "  + this.anno;
        return fecha;
    }
}
