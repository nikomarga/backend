/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresnik;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class VectoresNik {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
         int n,temporal, t;
         
         System.out.println("¿Cuantos elementos tiene el vector?");
         n=leer.nextInt();
         
         int[] numeros=new int[n];
         for (int i = 0; i< n; i++){
             System.out.println("Digite elemento " +i +"");
             numeros[i]=leer.nextInt();
         }
         t=n-1;
         for (int i = 0; i < n/2; i++) {
            temporal=numeros[i];
            numeros[i]=numeros[t];
            numeros[t]=temporal;
            t--;
        }
         System.out.println("\n\n elementos del vector");
         for (int i = 0; i < n; i++) {
             System.out.println(numeros[i] + " ");
            
        }
    }
    
    
}
