package com.co.project;

import java.util.Locale;
import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio11 {
    public static void main(String[] args) {

        String mensaje;
        int longitudMensaje;
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        Scanner captura = new Scanner(System.in);

        System.out.print("Ingresa un mensaje: ");
        mensaje = captura.nextLine();

        longitudMensaje = mensaje.length();

        for (int i = 0; i < longitudMensaje ; i++) {
            char letra = mensaje.toLowerCase().charAt(i);
            switch (letra){
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
            }
        }

        System.out.println("La longitud del mensaje es: " + longitudMensaje);
        System.out.println("El número de vocales es: ");
        System.out.println("a: " + contA);
        System.out.println("e: " + contE);
        System.out.println("i: " + contI);
        System.out.println("o: " + contO);
        System.out.println("u: " + contU);

    }
}
