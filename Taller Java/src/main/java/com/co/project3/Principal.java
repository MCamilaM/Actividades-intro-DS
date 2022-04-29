package com.co.project3;

/**
 * @Author Camila Morales
 */
public class Principal {
    public static void main(String[] args) {
        Electrodomestico [] electrodomesticos = new Electrodomestico[10];

        Lavadora lavadora1 = new Lavadora(350,"blanco",'B',50,31);
        Lavadora lavadora2 = new Lavadora(250,"negro",'C',50,15);
        Lavadora lavadora3 = new Lavadora(320,"blanco",'A',50,35);
        Lavadora lavadora4 = new Lavadora(400,"gris",'D',50,27);
        Lavadora lavadora5 = new Lavadora(570,"gris",'F',50,27);

        Television television1 = new Television(200,"rojo",'D',12,24,false);
        Television television2 = new Television(270,"negro",'E',20,40,false);
        Television television3 = new Television(300,"blanco",'C',25,50,true);
        Television television4 = new Television(250,"azul",'F',17,27,false);

        Electrodomestico electrodomestico1 = new Electrodomestico(180,"azul",'D',15);

        electrodomesticos[0] = lavadora1;
        electrodomesticos[1] = lavadora2;
        electrodomesticos[2] = lavadora3;
        electrodomesticos[3] = lavadora4;
        electrodomesticos[4] = lavadora5;
        electrodomesticos[5] = television1;
        electrodomesticos[6] = television2;
        electrodomesticos[7] = television3;
        electrodomesticos[8] = television4;
        electrodomesticos[9] = electrodomestico1;


        double precioLavadoras = 0;
        double precioTelevision = 0;
        double precioElectrodomestico = 0;

        for (int i = 0; i < electrodomesticos.length; i++) {

            if(electrodomesticos[i] instanceof Lavadora){
                Lavadora lavadora = (Lavadora) electrodomesticos[i];
                System.out.println("Lavadora $" + lavadora.precioFinal());
                precioLavadoras += lavadora.precioFinal();
                precioElectrodomestico += lavadora.precioFinal();

            }else if(electrodomesticos[i] instanceof Television){
                Television television = (Television) electrodomesticos[i];
                System.out.println("Television $" + television.precioFinal());
                precioTelevision += television.precioFinal();
                precioElectrodomestico += television.precioFinal();
            }else if(electrodomesticos[i] instanceof Electrodomestico){
                Electrodomestico electrodomestico = electrodomesticos[i];
                System.out.println("Electrodomestico $" +  electrodomestico.precioFinal());
                precioElectrodomestico += electrodomestico.precioFinal();
            }
        }
        System.out.println("\nPrecios Finales---------------------------");
        System.out.println("-Lavadoras $" + precioLavadoras);
        System.out.println("-Televisores $" + precioTelevision);
        System.out.println("-Electrodomesticos $" +precioElectrodomestico);
        System.out.println("--------------------------------------------");
    }
}
