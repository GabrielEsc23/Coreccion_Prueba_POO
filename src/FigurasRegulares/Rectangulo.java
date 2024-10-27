package FigurasRegulares;

public class Rectangulo {
    float ancho;
    float altura;

    public Rectangulo(){
        this.ancho = 0;
        this.altura = 0;
    }
    public float getAncho(){
        return ancho;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }
    public float gentAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float perimetro(){
        return 2*(ancho+altura);
    }
    public float area(){
        return (ancho*altura);
    }
}

