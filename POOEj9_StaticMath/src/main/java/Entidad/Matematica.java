package Entidad;

/**
 *
 * @author zero
 */
public class Matematica {
    private double numA;
    private double numB;

    public Matematica() {
    }

    public Matematica(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public String devolverMayor() {
        String mayor;
        
        if (this.numA > this.numB) {
            mayor = "A";
        } else {
            mayor = "B";
        }
        return mayor;
    }
    
    public double calcularPotencia() {
        double potencia;
        
        if (devolverMayor().equals("A")) {
            potencia = Math.pow(Math.round(this.numA), Math.round(this.numB));
        } else {
            potencia = Math.pow((int) Math.round(this.numB), (int) Math.round(this.numA));
        }
        return potencia;
    }
    
    public double calcularRaiz() {
        double raiz;
        if(devolverMayor().equals("A")) {
            raiz = Math.sqrt(Math.abs(this.numB));
        } else {
            raiz = Math.sqrt(Math.abs(this.numA));
        }
        return raiz;
    }
}
