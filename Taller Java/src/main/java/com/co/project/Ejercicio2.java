package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        int valor1;
        int valor2;

        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        valor1 = captura.nextInt();

        System.out.print("Ingrese un número: ");
        valor2 = captura.nextInt();

        if(valor1 > valor2){
            System.out.println("El número " + valor1 + " es mayor que " + valor2);
        }else if(valor2 > valor1){
            System.out.println("El número " + valor2 + " es mayor que " + valor1);
        }else{
            System.out.println("Los números son iguales");
        }
    }
}
