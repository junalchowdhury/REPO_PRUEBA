package uni.edu.pe.polimorfismoBasico;

public class Cuadrado extends Figura{
    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calcularArea(){
        System.out.println("Calcular area del cuadrado");
        return 0;
    }
}
