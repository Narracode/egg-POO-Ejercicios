package Entidad;

/**
 *
 * @author zero
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double sumar() {
        double suma = this.numero1 + this.numero2;
        return suma;
    }
    
    public double restar() {
        double resta = this.numero1 - this.numero2;
        return resta;
    }
    
    public double multiplicar() {
        double producto;
        
        if(this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("ERROR - Multiplicando por 0");
            producto = 0;
        } else {
            producto = this.numero1 * this.numero2;
        }
        return producto;
    }
    
    public double dividir() {
        double division;
        
        if(this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("ERROR - Dividiendo entre 0");
            division = 0;
        } else {
            division = this.numero1 / this.numero2;
        }
        return division;
    }
}
