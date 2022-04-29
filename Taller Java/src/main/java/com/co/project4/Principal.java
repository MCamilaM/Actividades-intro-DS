package com.co.project4;

/**
 * @Author Camila Morales
 */
public class Principal {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        Serie serie1 = new Serie("Case de papel", 5,"Suspenso","Alex Pina");
        Serie serie2 = new Serie("Estamos muertos", 1, "Drama coreano","Chun Sung-il");
        Serie serie3 = new Serie("El juego del calamar", 1,"Drama","Hwang Dong-hyunk");
        Serie serie4 = new Serie("Dark", 3,"Misterio","Baran bo Odar");
        Serie serie5 = new Serie("Perdidos en el espacio", 3,"Ciencia ficción","Matt Sazama");

        Videojuego videojuego1 = new Videojuego("Mario Bros", 400);
        Videojuego videojuego2 = new Videojuego("Contra", 15);
        Videojuego videojuego3 = new Videojuego("Bomberman", 80);
        Videojuego videojuego4 = new Videojuego("Tetris", 90);
        Videojuego videojuego5 = new Videojuego("Circus Charlie", 500, "Accion", "Konami");

        series[0] = serie1;
        series[1] = serie2;
        series[2] = serie3;
        series[3] = serie4;
        series[4] = serie5;

        videojuegos[0] = videojuego1;
        videojuegos[1] = videojuego2;
        videojuegos[2] = videojuego3;
        videojuegos[3] = videojuego4;
        videojuegos[4] = videojuego5;

        serie1.entregar();
        serie3.entregar();
        videojuego2.entregar();
        videojuego4.entregar();
        videojuego5.entregar();

        System.out.println("\n-Hay " + numeroSeriesEntregadas(series) + " Series entregadas.");
        System.out.println("-Hay " + numeroVideojuegosEntregados(videojuegos) + " Videojuegos entregados.");

        System.out.println("\n-El videojuego con más horas estimadas es: ");
        Videojuego videojuego = videojuegoConMasHoras(videojuegos);
        System.out.println(videojuego.toString());

        System.out.println("-La serie con más temporadas es:");
        Serie serie = serieConMasTemporadas(series);
        System.out.println(serie.toString());

    }

    /**
     * Método para hallar el videojuego con más horas
     * @param videojuegos
     * @return objeto de tipo Videojuego
     */
    public static Videojuego videojuegoConMasHoras(Videojuego[] videojuegos){
        Videojuego videojuego = videojuegos[1];
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i].compareTo(videojuego)){
                videojuego = videojuegos[i];
            }
        }
        return videojuego;
    }

    /**
     * Método para hallar la serie con más temporadas
     * @param series
     * @return objeto de tipo Serie
     */
    public static Serie serieConMasTemporadas(Serie[] series){
        Serie serie = series[1];
        for (int i = 0; i < series.length; i++) {
            if(series[i].compareTo(serie)){
                serie = series[i];
            }
        }
        return serie;
    }

    /**
     * Método que hallar el número de series que ya se han
     * entregado
     * @param series
     * @return número de series entregadas
     */
    public static int numeroSeriesEntregadas(Serie[] series){
        int contadorSeries = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i].isEntregado()){
                contadorSeries++;
            }
        }
        return contadorSeries;
    }

    /**
     * Método para hallar el número de videojuegos que han sido
     * entregados
     * @param videojuegos
     * @return número de videojuegos entregados
     */
    public static int numeroVideojuegosEntregados(Videojuego[] videojuegos){
        int contadorVideojuegos = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i].isEntregado()){
                contadorVideojuegos++;
            }
        }
        return contadorVideojuegos;
    }
}
