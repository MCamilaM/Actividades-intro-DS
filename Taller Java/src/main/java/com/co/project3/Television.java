package com.co.project3;

/**
 * @Author Camila Morales
 */
public class Television extends Electrodomestico{

    /**
     * Atributos
     */
    private double pulgadas;
    private boolean sintonizadosTDT;

    private double pulgadasPorDefecto = 20;
    private boolean isSintonizadosTDTPorDefecto = false;

    /**
     * Constructor
     */
    public Television() {
    }

    /**
     * Constructor
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    /**
     * Constructor
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param pulgadas
     * @param sintonizadosTDT
     */
    public Television(double precioBase, String color, char consumoEnergetico, double peso, double pulgadas, boolean sintonizadosTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadosTDT = sintonizadosTDT;
    }

    /**
     * Método para calcular el precio final con base en
     * las pulgadas y si tiene o no un sintonizador.
     * @return
     */
    public double precioFinal(){
        double precio = 0;
        if(this.pulgadas > 40){
             precio += super.precioBase * 0.30;
        }
        if(this.sintonizadosTDT){
            precio += 50;
        }
        precio += super.precioFinal();
        return precio;
    }

    /**
     * Método Get para obtener las pulgadas
     * @return pulgadas
     */
    public double getPulgadas() {
        return pulgadas;
    }

    /**
     * Método para verificar si tiene o no un
     * sintonizadorTDT
     * @return false or true
     */
    public boolean isSintonizadosTDT() {
        return sintonizadosTDT;
    }
}
