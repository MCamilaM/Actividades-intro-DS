package com.co.project;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        double precioProducto;
        double precioFinalConIVA;
        final double IVA = 0.21;

        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(captura.next());

        precioFinalConIVA = precioProducto + (precioProducto * IVA);

        System.out.println("El precio final con IVA del producto es: " + precioFinalConIVA);
    }


}
