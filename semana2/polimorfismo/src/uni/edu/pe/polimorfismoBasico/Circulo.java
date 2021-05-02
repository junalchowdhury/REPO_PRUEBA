package uni.edu.pe.polimorfismoBasico;

public class Circulo extends Figura{
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea(){
        System.out.println("Calcular area del circulo");
        return 0;
    }
}
