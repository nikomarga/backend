
package figuras_abstractas;

// LIBRERIAS

import java.util.Scanner;


public class Figuras_abstractas {

    //  CLASES
    
    public static void main(String[] args) {
        // Definicion de objetos y variables
        
        Scanner read = new Scanner(System.in);
        
        float lado, base, altura, radio, area, perimetro;
        int opcion;
     
        do{
            System.out.println("\n\t Menu de figuras");
            System.out.println("1. Cuadrado");
            System.out.println("2. Circulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Salir");
            System.out.println("Selecciona entre 1 y 4");
            opcion = read.nextInt();
        
            switch (opcion){
                case 1: System.out.println("Digite el lado del cuadrado ");
                        lado = read.nextFloat();
                        ClsCuadrado clscuadrado = new ClsCuadrado(lado);
                        area = clscuadrado.Hallar_area();
                        perimetro = clscuadrado.Hallar_perimetro();
                        System.out.println("\n El area del cuadrado es "+area);
                        System.out.println("El perimetro del cuadrado es "+perimetro);
                break;
                case 2: System.out.println("Digite el radio del circulo ");
                        radio = read.nextFloat();
                        ClsCirculo clscirculo = new ClsCirculo(radio);
                        area = clscirculo.Hallar_area();
                        perimetro = clscirculo.Hallar_perimetro();
                        System.out.println("\n El area del circulo es "+area);
                        System.out.println("El perimetro del circulo es "+perimetro);
                break;
                case 3: System.out.println("Digite la base del rectangulo ");
                        base = read.nextFloat();
                        System.out.println("Digite la altura del rectangulo ");
                        altura = read.nextFloat();
                        ClsRectangulo clsrectangulo = new ClsRectangulo(altura,base);
                        area = clsrectangulo.Hallar_area();
                        perimetro = clsrectangulo.Hallar_perimetro();
                        System.out.println("\n El area del rectangulo es "+area);
                        System.out.println("El perimetro del rectangulo es "+perimetro);
                break;
            }
        }while( opcion == 4);
    }
}       
  