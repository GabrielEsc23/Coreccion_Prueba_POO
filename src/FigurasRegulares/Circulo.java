package FigurasRegulares;

public class Circulo {
    float radio;
   public Circulo() {
       this.radio = 0;
   }
   public float getRadio() {
       return radio;
   }
   public void setRadio(float radio) {
       this.radio = radio;
   }
   public float perimetro() {
       return 2 *(float)Math.PI*radio;
   }
   public float area() {
       return (float)Math.PI*radio*radio;
   }


}
