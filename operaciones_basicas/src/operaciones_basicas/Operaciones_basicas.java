/*Realizar un programa que lea dos numeros enteros y luego
imprima la suma, la resta, la multiplicaciones y la division*/

package operaciones_basicas;
// Aqui se ubican las librerias

import java.util.Scanner;


public class Operaciones_basicas {
//metodos locales
    public static void main(String[] args) {
        
        // Definir objetos y variables
        Scanner objleer= new Scanner(System.in);
        int num1,num2,suma,resta,multiplicacion,opc;
        float division;
     
        //Lectura de los datos de entrada
        System.out.print("Digite el numero uno ");
        num1=objleer.nextInt();
        System.out.print("Digite el numero dos ");
        num2=objleer.nextInt();
        
        //operaciones
        
        do{
            System.out.println("\n\n\t Menu de operaciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("Digite entre 1 y 5 ");
            opc=objleer.nextInt();
            
        switch (opc) {
            case 1: suma=num1 + num2;
                System.out.println("La suma es " + suma);
                break;
            case 2: resta=num1 - num2;
                System.out.println("La resta es " + resta);
                break;
            case 3: multiplicacion=num1 * num2;
                System.out.println("La multiplicacion es " + multiplicacion);
                break;
            case 4:if (num2 == 0)
                System.out.println("Operacion no valida ");
                    else{
                        division=(float)num1/num2;
                        System.out.println("La division es " + division);
                    }
         
        }
            
        }while(opc != 5);
    }
    
}
