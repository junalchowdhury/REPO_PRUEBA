package uni.edu.pe.polimorfismoBasico;

public class Figura {

    private float coordx;
    private float coordY;

    public float getCoordx() {
        return coordx;
    }

    public void setCoordx(float coordx) {
        this.coordx = coordx;
    }

    public float getCoordY() {
        return coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }

    public float calcularArea(){
        System.out.println("Calcular area de la figura");
        return 0;
    }

    private void rotar() {
        System.out.println("Rotar de la figura");
    }

    private void trasladar() {
        System.out.println("Trasladar de la figura");
    }

}
