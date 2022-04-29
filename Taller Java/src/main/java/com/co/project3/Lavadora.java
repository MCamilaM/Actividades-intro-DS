package com.co.project3;

/**
 * @Author Camila Morales
 */
public class Lavadora extends Electrodomestico {

    /**
     * Atributos
     */
    private double carga;

    private final double cargaPorDefecto = 5;

    /**
     * Constructor vacío
     */
    public Lavadora() {
    }

    /**
     * Constructor
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = cargaPorDefecto;
    }

    /**
     * Constructor
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param carga
     */
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * Método Get para obtener la capacidad de
     * carga de una Lavadora.
     * @return
     */
    public double getCarga() {
        return carga;
    }

    /**
     * Método para calcular el precio final de acuerdo
     * a su capacidad de carga.
     * @return
     */
    public double precioFinal(){
        double precio = 0;
        if(this.carga > 30){
            precio += 50;
        }
        precio += super.precioFinal();
        return precio;
    }
}
