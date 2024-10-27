import java.util.Scanner;

import FigurasRegulares.Circulo;
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Rectangulo;
import FigurasRegulares.Triangulo;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Cuadrado
        Cuadrado cuadrado1 = new Cuadrado();
        System.out.println("Ingresa el lado del cuadrado ");
        float lado=entrada.nextFloat();
        cuadrado1.setLado(lado);
        System.out.println("El area del cuadrado: " + cuadrado1.area());
        System.out.println("El perimetro del cuadrado: " + cuadrado1.perimetro());
        //Rectangulo
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Ingresa el ancho del rectangulo: ");
        float ancho=entrada.nextFloat();
        rectangulo1.setAncho(ancho);
        System.out.println("Ingresa el altura del rectangulo: ");
        float altura=entrada.nextFloat();
        rectangulo1.setAltura(altura);
        System.out.println("El area del rectangulo es: " + rectangulo1.area());
        System.out.println("El perimetro del rectangulo: " + rectangulo1.perimetro());
        //Circulo
        Circulo circulo1 = new Circulo();
        System.out.println("Ingresa el radio del circulo: ");
        float radio=entrada.nextFloat();
        circulo1.setRadio(radio);
        System.out.println("El area del circulo es: " + circulo1.area());
        System.out.println("El perimetro del circulo: " + circulo1.perimetro());
        // Triangulo
        Triangulo triangulo1 = new Triangulo();
        System.out.println("Ingresa la base del triangulo: ");
        float base=entrada.nextFloat();
        triangulo1.setBase(base);
        System.out.println("Ingresa la altura del triangulo: ");
        float altura2 =entrada.nextFloat();
        triangulo1.setAltura(altura2);
        System.out.println("El area del triangulo es: " + triangulo1.area());
        System.out.println("El perimetro del triangulo: " + triangulo1.perimetro());
        float sumaPerimetros=cuadrado1.perimetro()+rectangulo1.perimetro() + circulo1.perimetro()+triangulo1.perimetro();
        System.out.println("La suma de perimetros es: " + sumaPerimetros);
        float sumaArea=cuadrado1.area()+rectangulo1.area() + circulo1.area()+triangulo1.area();
        System.out.println("La suma de area es: " + sumaArea);
        entrada.close();

    }
}