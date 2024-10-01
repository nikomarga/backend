/* Crae una clase qeu cree un registro usando encapsulamiento con los siguientes
* datos: Identificacion del alumno, nombre, genero, edad, numero de materias,
* valor por materia y tecnica que estudia y luego realize las siguientes tareas:
    - Valor bruto
    - Descuento 

 */
package universidad;

//LIBRERIAS

import java.util.Scanner;


public class Universidad {

    // Metodo de la clase
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Clsmatricula Clsmatricula = new Clsmatricula(); //Instanciar el Objeto de la clase Cls
        
        String codigo, nombre, sexo, tecnica;
        int nro_materias, edad;
        float valor_materias;
        
        //Entrada de datos
        
        System.out.println("¿Cual es su codigo?");
        codigo = read.nextLine();
        
        System.out.println("¿Cual es su nombre?");
        nombre = read.nextLine();
        
        System.out.println("¿Cual es su sexo?");
        sexo = read.nextLine();
        
        System.out.println("Cual es tu tecnica?");
        tecnica = read.nextLine();
        System.out.println("¿Cual es su edad?");
        edad = read.nextInt();
        System.out.println("¿Cuantas materias son?");
        nro_materias = read.nextInt();
        
        System.out.println("¿Cuanto es el valor por materia inscrita?");
        valor_materias = read.nextFloat();
        
        
        //Enviar informacion a objeto
        
        Clsmatricula.setNro_materias(nro_materias);
        Clsmatricula.setVal_materia(valor_materias);
        Clsmatricula.setSexo(sexo);
        Clsmatricula.setCodigo(codigo);
        Clsmatricula.setEdad(edad);
        Clsmatricula.setTecnica(tecnica);
        
        //Realizar operacion
        
        Clsmatricula.Calcular_matricula();
        
        //Imprimir los resultados
        
        System.out.println("El valor bruto es " + Clsmatricula.getValor_bruto());
        System.out.println("El descuento es " +Clsmatricula.getDescuento());
        System.out.println("El valor neto es " +Clsmatricula.getValor_neto());
        
    }
    
}
