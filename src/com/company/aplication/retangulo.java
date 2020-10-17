package com.company.aplication;

public class retangulo {
    private double largura;
    private double altura;

    public retangulo(double largura,double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return altura * largura;
    }
    public  double perimetro(){
        return (largura * 2) + (altura * 2);
    }

    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }
/*
    @Override
    public String toString() {
        return "{" +
                "largura: " + largura +
                ", altura: " + altura +
                ", area: " + area() +
                ", perimetro: " + perimetro() +
                ",diagonal: %.2f%" + diagonal() +
                " }";
    }

 */
}
