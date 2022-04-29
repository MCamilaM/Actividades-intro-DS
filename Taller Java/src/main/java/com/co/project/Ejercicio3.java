package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double area;
        double radio;

        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        radio = Double.parseDouble(captura.next());

        area = Ejercicio3.calcularAreaCirculo(radio);

        System.out.println("El area del circulo es " + area);
    }
    public static double calcularAreaCirculo(double radio){
        final double PI = 3.1415;
        double radioCuadrado = Math.pow(radio,2);
        return PI*radioCuadrado;
    }
}
