
package figuras_abstractas;


public class ClsCirculo  extends Clsfiguras{
    
    private float radio;

    public ClsCirculo(float radio) {
        this.radio = radio;
    }
    
    
    @Override
    public float Hallar_area() {
      float area = radio * radio;
      return area;
    }

    @Override
    public float Hallar_perimetro() {
      float perimetro = 2 * radio;
      return perimetro;
    }
    
}
