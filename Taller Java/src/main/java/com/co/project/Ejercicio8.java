package com.co.project;
import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        String dia;
        Scanner captura = new Scanner(System.in);

        System.out.print("ingrese un día de la semana: ");
        dia = captura.next().toLowerCase();


        switch (dia){
            case "lunes":
                System.out.println("->El " + dia + " es un día laboral");
                break;
            case "martes":
                System.out.println("->El " + dia + " es un día laboral");
                break;
            case "miercoles":
                System.out.println("->El " + dia + " es un día laboral");
                break;
            case "jueves":
                System.out.println("->El " + dia + " es un día laboral");
                break;
            case "viernes":
                System.out.println("->El " + dia + " es un día laboral");
                break;
            case "sabado":
                System.out.println("->El " + dia + " no es un día laboral");
                break;
            case "domingo":
                System.out.println("->El " + dia + " no es un día laboral");
                break;
            default:
                System.out.println("->dia de la semana no valido");
        }

    }
}
