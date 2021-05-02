package uni.edu.pe.polimorfismoBasico;

import java.util.ArrayList;

public class Ejecuta {

    public static void main(String[] args) {
        Figura figura = new Figura();

        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();

        Figura circulo = new Circulo();
        circulo.setCoordx(1.0f);
        circulo.setCoordY(2.0f);
        Figura cuadrado = new Cuadrado();
        Figura trianglo = new Triangulo();

        ArrayList<Figura> list = new ArrayList<>();
        list.add(circulo);
        list.add(cuadrado);
        list.add(trianglo);

        /*
        ArrayList<Circulo> lstCircle = new ArrayList<>();
        lstCircle.add(cir);
        lstCircle.add(cua);
        */

        System.out.println(circulo.getCoordx());

        Circulo circulo2 = (Circulo) circulo;
        circulo2.setRadio(3.0f);

        System.out.println(circulo2.getCoordx());
        System.out.println(circulo2.getCoordY());
        System.out.println(circulo2.getRadio());

        /*
        circulo.calcularArea();
        //circulo.setRadio();
        Circulo circulo2 = (Circulo)circulo;
        circulo2.setRadio(12);
         */
    }


}
