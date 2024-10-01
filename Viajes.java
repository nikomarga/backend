/*Si se tiene como datos de entrada el numero de personas y la ciudad destino, 
hacer un programa que calcule e imprima:
-Valor bruto (es el numero de personas multiplicado por el valor del viaje 
(Si la ciudad destino es Cartagena es costo por persona es de 600000 pesos, si es Cali el costo es de 500000 pesos y si es Montería el costo por persona es de 400000 pesos) (realizarlo en el programa principal)
-Valor del IVA (es del 19% sobre el valor bruto)
-Valor neto
Nota: Utilizar una clase con dos funciones y al menos un constructor (cada una calcula un ítem)
*/
package viajesnacionales;

import java.util.Scanner;

public class Viajes {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        
        double valorBruto;
        double iva, neto,valorViaje = 0 ;
        int numPersonas = 3;
        String ciudadDestino = "Cali";
        
        switch (ciudadDestino) {
            case "Cartagena":
                valorViaje =  600000;
                break;
            case "Cali":
                valorViaje = 500000;
                break;
            case "Monteria":
                valorViaje =  400000;
                break; 
        }
        
        valorBruto = numPersonas * valorViaje;
      
        
        //instancia la clase
        valorViaje  Valorviaje = new valorViaje(valorBruto);
        
        iva = Valorviaje.clacular_valor_iva();
        neto = Valorviaje.valor_neto(iva);
        
    
        //salidas
        System.out.println("Valor Bruto: "+valorBruto);
        System.out.println("Valor Iva: "+iva);
        System.out.println("Valor Neto: "+neto);
        
        
        
        
    }    
}