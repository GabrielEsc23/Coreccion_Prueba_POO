package FigurasRegulares;

public class Cuadrado {
    float lado;

    public Cuadrado() {
        this.lado = 0; // Inicialización
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float perimetro() {
        return lado * 4;
    }

    public float area() {
        return lado * lado;
    }
}