package Entidad;

/**
 *
 * @author zero
 */
public class CuentaBancaria {
    private int numeroDeCuenta;
    private long DNI;
    private double saldoActual;
    private double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, long DNI, double saldoActual, double interes) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
        System.out.println("Se ha añadido la cantidad de $" + ingreso + " al "
                + "saldo de la cuenta");
    }
    
    public void retirar(double retiro) {
        this.saldoActual -= retiro;
        System.out.println("Entregando Efectivo por la suma de $" + retiro);
    }
    
    public double extraccionRapida() {
        double limite = this.saldoActual * .2;
        return limite;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "\nnumeroDeCuenta=" + numeroDeCuenta + "\nDNI=" + DNI + "\n}";
    }

}
