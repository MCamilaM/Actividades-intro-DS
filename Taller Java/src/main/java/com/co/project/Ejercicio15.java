package com.co.project;
import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner captura = new Scanner(System.in);

        while(opcion != 8){

            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n" +
                    "**************************************************");

            System.out.print("Ingrese una opcion: ");
            opcion = captura.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        }
    }

}
