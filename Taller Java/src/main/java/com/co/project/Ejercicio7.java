package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        int numero;

        do {
            System.out.print("ingrese un número: ");
            numero = captura.nextInt();
        }while(numero < 0);

        System.out.println("El número fue: " + numero);
    }
}
