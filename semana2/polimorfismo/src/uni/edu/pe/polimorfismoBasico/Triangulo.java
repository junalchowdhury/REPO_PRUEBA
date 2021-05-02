package uni.edu.pe.polimorfismoBasico;

public class Triangulo extends Figura {
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcularArea(){
        System.out.println("Calcular area del triangulo");
        return 0;
    }

}