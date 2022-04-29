package com.co.project2;

/**
 * @Author Camila Morales
 */
public class Persona {

    /**
     * Atributos
     */
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    /**
     * Constructor
     */
    public Persona() {
        this.DNI = generaDNI();
    }

    /**
     * Constructor
     * @param nombre
     * @param edad
     * @param sexo
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generaDNI();
        comprobarSexo(sexo);
    }

    /**
     * Constructor
     * @param nombre
     * @param edad
     * @param sexo
     * @param peso
     * @param altura
     */
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
    }

    /**
     * Método para calcular el IMC
     * (Indice de Masa Corporal)
     * @return un número que hace referencia al IMC
     */
    public int calcularIMC(){
        final int menorVeinte = -1;
        final int entreVeinteYVeinticinco = 0;
        final int mayorVeinticinco = 1;
        double formulaIMC = this.peso * (Math.pow(this.altura,2));
        if(formulaIMC < 20){
            return menorVeinte;
        }else if(formulaIMC >= 20 && formulaIMC <= 25){
            return entreVeinteYVeinticinco;
        }else{
            return mayorVeinticinco;
        }
    }

    /**
     * Comprueba si es mayor de edad
     * @return false or true
     */
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    /**
     * Combrueba si el valor introducido en el atributo
     * sexo no sea diferente a 'H' o 'F'
     * @param sexo
     */
    private void comprobarSexo(char sexo){
        if(!(sexo == 'H' || sexo == 'F')){
            this.sexo = 'H';
        }
    }

    /**
     * sobreescritura del método toString
     * @return las propiedades de tipo persona
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", edad=" + this.edad +
                ", DNI=" + this.DNI +
                ", sexo=" + this.sexo +
                ", peso=" + this.peso +
                ", altura=" + this.altura +
                '}';
    }

    /**
     * Genere un identificador univo para cada objeto instanciado
     * @return DNI
     */
    private String generaDNI(){
        int numeroAleatorio = (int) Math.floor(Math.random() * (99999999 - 00000001) + 00000001);
        char letra = generarLetra();
        String DNI = Integer.toString(numeroAleatorio) + letra;
        return DNI;
    }

    /**
     * Genera una letra aleatoria
     * @return
     */
    private char generarLetra(){
        int  numeroAleatorio = (int) Math.floor(Math.random() * (91 - 65) + 65);
        char letra = (char) numeroAleatorio;
        return letra;
    }

    /**
     *Getters y Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
