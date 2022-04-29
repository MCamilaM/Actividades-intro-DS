package com.co.project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author Camila Morales
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        String fechaActual = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Fecha actual: " + fechaActual);
    }


}
