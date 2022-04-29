package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int numero;
        Scanner captura = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        numero = captura.nextInt();

        for (int i = numero; i <= 1000 ; i += 2) {
            System.out.println(i);
        }
    }
}
