package Entidad;

/**
 *
 * @author zero
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int perimetro() {
        int perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }
    
    public int area() {
        int area = this.base * this.altura;
        return area;
    }
    
}
