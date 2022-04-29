package com.co.project3;

/**
 * @Author Camila Morales
 */
public class Electrodomestico {

    /**
     * Atributos
     */
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    private final String colorPorDefecto = "blanco";
    private final char consumoEnergeticoPorDefecto = 'F';
    private final double precioBasePorDefecto = 100;
    private final double pesoPorDefecto =5;

    /**
     * Constructor vacío
     */
    public Electrodomestico() {
        this.precioBase = precioBasePorDefecto;
        this.color = colorPorDefecto;
        this.consumoEnergetico = consumoEnergeticoPorDefecto;
        this.peso = pesoPorDefecto;
    }

    /**
     * Constructor
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorPorDefecto;
        this.consumoEnergetico = consumoEnergeticoPorDefecto;
    }

    /**
     * Constructor
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    /**
     * Método para comprobar el consumo energetico de
     * un Electrodomestico
     * @param letra
     */
    private void comprobarConsumoEnergetico(char letra){
        if(letra >= 65 &&  letra <= 70){
            this.consumoEnergetico = letra;
        }else{
            this.consumoEnergetico = consumoEnergeticoPorDefecto;

        }
    }

    /**
     * Método para verificar el color de un Electrodomestico
     * @param color
     */
    private void comprobarColor(String color){
        String colores[] = {"blanco","negro","rojo","azul","gris"};
        String colorr = color.toLowerCase();
        this.color = colorPorDefecto;
        for (int i = 0; i < colores.length -1; i++) {
            if(colorr.equals(colores[i])){
                this.color = color;
            }
        }
    }

    /**
     * Método para totalizar el precio final de un
     * electrodomestico según su precio por consumo y su tamaño
     * @return
     */
    public double precioFinal(){
        double precioFinal = this.precioBase;
        precioFinal += calcularPrecioPorConsumoEnergetico();
        precioFinal += calcularPrecioPorTamano();
       return precioFinal;
    }

    /**
     * Método para calcular el precio de un eletrodomestico
     * por su consumo energetico.
     * @return
     */
    private double calcularPrecioPorConsumoEnergetico(){
        double precioFinal = 0;
        switch (this.consumoEnergetico){
            case 'A':
                precioFinal = 100;
                break;
            case 'B':
                precioFinal = 80;
                break;
            case 'C':
                precioFinal = 60;
                break;
            case 'D':
                precioFinal = 50;
                break;
            case 'E':
                precioFinal = 30;
                break;
            case 'F':
                precioFinal = 10;
                break;
        }
        return precioFinal;
    }
    private double calcularPrecioPorTamano(){
        double peso = this.peso;
        double precio = 0;
        if(peso >= 0 && peso <= 19){
            precio = 10;
        }else if(peso >= 20 && peso <= 49){
            precio = 50;
        }else if(peso >= 50 && peso <= 79){
            precio = 80;
        }else if(peso >= 80){
            precio = 100;
        }
        return precio;
    }

    /**
     *Getters y Setters
     */

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
