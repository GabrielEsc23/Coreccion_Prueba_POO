package FigurasRegulares;

public class Triangulo {
    float base;
    float altura2;
    public Triangulo(){
        this.base=0;
        this.altura2=0;

    }
    public float getBase(){
        return base;
    }
    public void setBase(float base){
        this.base = base;
    }
    public float getAltura(){
        return altura2;
    }
    public void setAltura(float altura2){
        this.altura2= altura2;
    }
    public float perimetro(){
        return base *3;
    }
    public float area(){
        return (base*altura2)/2;
    }

}
