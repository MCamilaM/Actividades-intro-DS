package com.co.project2;

import java.util.Scanner;

/**
 * @Author Camila Morales
 */
public class PrincipalPersona {

    public static void main(String[] args) {

        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = captura.next();

        System.out.print("Ingrese la edad: ");
        edad = captura.nextInt();

        System.out.print("Ingrese el sexo: ");
        String sexoS = captura.next();
        sexo = sexoS.charAt(0);

        System.out.print("Ingrese el peso: ");
        peso = captura.nextDouble();

        System.out.print("Ingrese el altura: ");
        altura = captura.nextDouble();

        //Se instancia los objetos de tipo Persona.
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        //Se establecen valores al objeto
        persona3.setNombre("Camila");
        persona3.setEdad(19);
        persona3.setSexo('F');
        persona3.setPeso(70);
        persona3.setAltura(1.64);

        System.out.println();

        //Se calcula el rango en el que se encuentra su IMC.
        comprobarPesoIdeal(persona1.calcularIMC());
        comprobarPesoIdeal(persona2.calcularIMC());
        comprobarPesoIdeal(persona1.calcularIMC());

        System.out.println();

        //Se pregunta si los objetos de tipo Persona son mayores de edad.
        esMayorDeEdad(persona1.esMayorDeEdad());
        esMayorDeEdad(persona1.esMayorDeEdad());
        esMayorDeEdad(persona1.esMayorDeEdad());

        System.out.println();

        //Se imprime todas las propiedades de los objetos de tipo Persona.
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());


    }

    /**
     * Método para situar el IMC
     * (Indice de Masa Corporal)
     * @param num
     */
    public static void comprobarPesoIdeal(int num){
        if(num == 1){
            System.out.println("-Tiene sobrepeso");
        }else if(num == 0){
            System.out.println("-Está por debajo de su peso ideal");
        }else{
            System.out.println("-Está en su peso ideal");
        }
    }

    /**
     * Método para imprimir si es mayor de edad o no.
     * @param edad
     */
    public static void esMayorDeEdad(boolean edad){
        if(edad){
            System.out.println("-Es mayor de edad");
        }else{
            System.out.println("-No es mayor de edad");
        }
    }
}
