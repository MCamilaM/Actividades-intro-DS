package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;

        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        palabra1 = captura.next();
        System.out.print("Ingrese una palabra: ");
        palabra2 = captura.next();


        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            int tamanoPalabra1 = palabra1.length();
            int tamanoPalabra2 = palabra2.length();
            int tamano = tamanoPalabra1 > tamanoPalabra2 ? tamanoPalabra2 : tamanoPalabra1;
            System.out.println("Las diferencias son: ");
            for (int i = 0; i < tamano; i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    System.out.print(palabra1.charAt(i) + " - ");
                }
            }
        }
    }

}
