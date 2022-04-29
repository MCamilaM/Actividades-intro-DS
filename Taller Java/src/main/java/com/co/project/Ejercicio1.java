package com.co.project;

/**
 * @Author Camila Morales
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 5;

        if(valor1 > valor2){
            System.out.println("El número " + valor1 + " es mayor que " + valor2);
        }else if(valor2 > valor1){
            System.out.println("El número " + valor2 + " es mayor que " + valor1);
        }else{
            System.out.println("Los números son iguales");
        }
    }

}
