package com.co.project4;

/**
 * @Author Camila Morales
 */
public class Serie implements Entregable{

    /**
     * Atributos
     */
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    /**
     * Constructor
     */
    public Serie() {
        this.titulo = "";
        this.numeroDeTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    /**
     * Constructor
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    /**
     * Constructor
     * @param titulo
     * @param numeroDeTemporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    /**
     * Getters y Setters
     */
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * Método to String
     * @return String con las propiedades del objeto
     */
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    /**
     * Métodos sobreescritos de la clase Padre
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        Serie serie = (Serie) a;
        if((this.numeroDeTemporadas > serie.getNumeroDeTemporadas())){
            return true;
        }
        return false;
    }
}
