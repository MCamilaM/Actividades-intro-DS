package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        String mensaje;
        Scanner captura = new Scanner(System.in);

        String cadena = "La sonrisa sera la mejor arma contra la tristeza";
        cadena = cadena.replace('a','e');

        System.out.print("ingrese una frase: ");
        mensaje = captura.nextLine();
        cadena = cadena.concat(" " + mensaje);

        System.out.println(cadena);
    }
}
