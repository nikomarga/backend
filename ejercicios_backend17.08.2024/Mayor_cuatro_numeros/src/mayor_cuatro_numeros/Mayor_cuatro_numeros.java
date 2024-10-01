/*
 * Realice un programa que lea cuatro numeros n1, n2, n3 y n4 y luego imprima
 * el mayor de ellos (utiliza clases y funciones).
*/
package mayor_cuatro_numeros;

//Librerias
import java.util.Scanner;

public class Mayor_cuatro_numeros {

//metodos locales 
    
    public static void main(String[] args) {
    
        // OBJETOS Y VARIABLES
  
    Scanner leer = new Scanner(System.in);
    ClsMayor objmayor = new ClsMayor();
 
    int n1,n2,n3,n4;
    int mayor1,mayor2,mayorfinal;
            
        System.out.println("Ingrese 4 numeros: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        n3 = leer.nextInt();
        n4 = leer.nextInt();
        
    //Hallar el mayor
    
    mayor1 =objmayor.Hallar_numero_mayor(n1, n2);
    mayor2 =objmayor.Hallar_numero_mayor(n3, n4); 
    mayorfinal =objmayor.Hallar_numero_mayor(mayor1, mayor2);
    
        System.out.println("El numero mayor es " + mayorfinal);
    
    }
    
}
