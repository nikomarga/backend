/* Metodo para hallar el mayor de dos numeros
 */
package mayor_cuatro_numeros;

//LIBRERIAS

public class ClsMayor {
    public int Hallar_numero_mayor(int dato1, int dato2){
        int mayor = 0 ;
        if (dato1 > dato2) {
            mayor = dato1;
        }else{
            mayor = dato2;
        }
        return mayor;
    
    }
    
}
