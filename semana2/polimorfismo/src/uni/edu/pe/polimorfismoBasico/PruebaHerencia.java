package uni.edu.pe.polimorfismoBasico;

public class PruebaHerencia {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setCoordx(3.5f);
        cuadrado.setCoordY(4.0f);
        cuadrado.setLado(2.0f);
        System.out.println(cuadrado.getCoordx());

        Figura fig = new Figura();
        fig.setCoordx(3.5f);
        fig.setCoordY(4.0f);
        //fig.setLado(2.0f);

        Circulo cir = new Circulo();
        cir.setRadio(6.5f);
        cir.setCoordx(6.7f);
        
    }
}
