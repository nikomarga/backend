/* Elaborar una aplicación con clases, funciones y constructores 
   para hallar el valor el bruto, el descuento y el valor neto a 
   pagar por un cliente si los datos de entrada son la cantidad 
   de películas y el valor por película vendida en una tienda de 
   video, el descuento se calcula dependiendo de la cantidad de 
   películas vendidas así: es del 10% sobre el valor bruto si 
   llevo 5 o más películas y no se le da descuento si lleva menos 
   de 5 películas. Hacer el programa principal correspondiente 
   para instanciar la clase y mostrar su funcionamiento.
   Nota: hacer una función para cada tarea (hallar valor bruto, 
   descuento y valor neto). */
package venta_peliculas;
// Librerias
import java.util.Scanner;

public class Venta_peliculas {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner read=new Scanner(System.in);
        float val_unitario, val_bruto,descuento,val_neto;
        int cant_peliculas;
        // Leer el valor unitario y la cantidad de peliculas
        System.out.print("¿Cuanto cuesta cada pelicula? ");
        val_unitario=read.nextFloat();
        System.out.print("¿Cuantas peliculas va a llevar? ");
        cant_peliculas=read.nextInt();
        // Instanciar la clase Clstienda
        Clstienda clstienda=new Clstienda(cant_peliculas);
        // Transferir control a la clase Clstienda para realizar 
        // las tareas
        val_bruto=clstienda.Calcular_valor_bruto(val_unitario);
        descuento=clstienda.Calcular_descuento(val_bruto);
        val_neto=clstienda.Calcular_valor_neto(val_bruto, descuento);
        // Entregar resultados
        System.out.println("\n El valor bruto de la compra es "+val_bruto);
        System.out.println(" El descuento de la compra es "+descuento);
        System.out.println(" El valor neto a pagar es "+val_neto);
    }
}
