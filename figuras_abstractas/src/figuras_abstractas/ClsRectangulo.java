
package figuras_abstractas;

public class ClsRectangulo extends  Clsfiguras{
    
    private float base;
    private float altura;

    public ClsRectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float Hallar_area() {
        float area = base * altura;
        return area;
    }

    @Override
    public float Hallar_perimetro() {
       float perimetro = 4 * (base + altura);
       return perimetro;
    }

  
    
}
