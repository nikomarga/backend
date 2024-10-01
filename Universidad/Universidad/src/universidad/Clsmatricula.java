/* Encapsular los datos de entrada (set) y salida (get) hacer metodo
*(Procedimiento) para calcular valor bruto, descuento y valor neto
*/
package universidad;


public class Clsmatricula {
    
    private int nro_materias, edad;
    private float val_materia, valor_bruto, descuento, valor_neto;
    private String sexo, tecnica, codigo;
    
    //Setter

    public void setNro_materias(int nro_materias) {
        this.nro_materias = nro_materias;
    }

    public void setVal_materia(float val_materia) {
        this.val_materia = val_materia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    
    //Getters
    
    public float getValor_bruto() {
        return valor_bruto;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getValor_neto() {
        return valor_neto;
    }
    
   
    public void Calcular_matricula(){
        valor_bruto = nro_materias * val_materia;
        
        if(sexo.equalsIgnoreCase("Femenino") && tecnica.equalsIgnoreCase("Sistemas") && edad < 18){
            descuento = (float) (valor_bruto * 0.10) ;
        }else{
            descuento = 0;
        }
        
        valor_neto = valor_bruto - descuento;
    }// Fin del metodo calcular materias
    
    
        
}

