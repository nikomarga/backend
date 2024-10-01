/* Metodos para calcular el valor bruto, el descuento y el valor neto */
package venta_peliculas;

public class Clstienda {
    
   private int cant_peliculas;

    public Clstienda(int cant_peliculas) {
        this.cant_peliculas = cant_peliculas;
    }

   public float Calcular_valor_bruto(float val_unitario){
       float valor_bruto;
       valor_bruto=cant_peliculas * val_unitario;
       return valor_bruto;
   }//fin metodo Calcular_valor_bruto
   
   public float Calcular_descuento(float val_bruto){
       float descuento=0;
       if (cant_peliculas >= 5)
           descuento=(val_bruto * 10)/100;
       return descuento;
   } // fin del metodo Calcular_descuento

   public float Calcular_valor_neto(float val_bruto,float descuento){
       float val_neto;
       val_neto=val_bruto - descuento;
       return val_neto;
   } // fin metodo Calcular_valor_neto
}
