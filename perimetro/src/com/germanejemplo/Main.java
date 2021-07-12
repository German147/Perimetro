package com.germanejemplo;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //iniciamos variables
        double lado;
        double perimetro;

        //solicitamos ingreso de datos
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el perimetro del cuadrado en cm");

        //parseamos el numero en String
        lado = Double.parseDouble(String.valueOf(input.nextDouble()));
        perimetro = lado * 4;

        System.out.println("El Perimetro es: " + perimetro + "cm");
    }
}
