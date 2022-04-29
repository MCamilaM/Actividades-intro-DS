package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio10 {
    public static void main(String[] args) {

        String mensaje;
        String mensaje2;
        Scanner captura = new Scanner(System.in);

        System.out.println("Ingresa un mensaje: ");
        mensaje = captura.nextLine();

        mensaje2 = mensaje.replace(" ", "");

        System.out.println(mensaje2);



    }
}
