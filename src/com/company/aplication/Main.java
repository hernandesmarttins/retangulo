package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com a  largura e altura do retangulo:");
        System.out.print("largura: ");
        float largura = input.nextFloat();
        System.out.print("altura: ");
        float altura = input.nextFloat();

        retangulo retangulo = new retangulo(largura,altura);

        System.out.printf("AREA: %.2f%n", retangulo.area());
        System.out.printf("Perimetro %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal %.2f%n", retangulo.diagonal());


        System.out.println("update date: " + retangulo);

        input.close();
    }
}
