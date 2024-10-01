// metodo para calcular el area y perimeto de un cuadrado

package figuras_abstractas;

public class ClsCuadrado extends Clsfiguras {
    
    private float lado;
    
    public ClsCuadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float Hallar_area() {
        float area = lado * lado;
        return area;
    }


    @Override
    public float Hallar_perimetro() {
        float perimetro = 4 * lado;
        return perimetro;
    }
    
    
}
