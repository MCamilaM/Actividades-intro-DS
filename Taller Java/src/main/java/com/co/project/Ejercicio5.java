package com.co.project;

/**
 * @Author Camila Morales
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        int contador = 1;

        while(contador <= 100){
            if(contador % 2 == 0){
                System.out.println(contador + "  -  par");
            }else{
                System.out.println(contador + "  -  impar");
            }
            contador++;
        }
    }
}
