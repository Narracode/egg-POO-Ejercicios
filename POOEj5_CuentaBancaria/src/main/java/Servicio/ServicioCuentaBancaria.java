package Servicio;

import java.util.Scanner;
import Entidad.CuentaBancaria;
/**
 *
 * @author zero
 */
public class ServicioCuentaBancaria {
    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cB = new CuentaBancaria();
        
        System.out.print("Bienvenido.\nPor favor, digita tu DNI, importaremos tus datos > ");
        cB.setDNI(leer.nextLong());
        cB.setNumeroDeCuenta((int)cB.getDNI()/2);
        System.out.print("Monto del deposito inicial que llegara a tu saldo > ");
        cB.setSaldoActual(leer.nextDouble());
  
        return cB;
    }
    
    public void hacerDeposito(CuentaBancaria cB) {
        System.out.print("¿Que cantidad vas a depositar? > ");
        cB.ingresar(leer.nextDouble());
        consultarSaldo(cB);
    }
    
    public void hacerRetiro(CuentaBancaria cB) {
        double saldo = cB.getSaldoActual();
        consultarSaldo(cB);
        System.out.print("\n*Asistente Interactivo de dispocicion de efectivo*"
                + "\n¿Que cantidad vas a Retirar? > ");
        double retiro = leer.nextDouble();
        if(saldo < retiro) {
            System.out.println("No cuentas con fondos suficientes para el retiro de: " 
                + retiro +"\nEntregando el monto total del saldo por la suma $" +cB.getSaldoActual());
            retiro = saldo;
        }
        cB.retirar(retiro);
        consultarSaldo(cB);
    }
    
    public void hacerExtraccionRapida(CuentaBancaria cB) {
        double lim = cB.extraccionRapida(), extraccion;
        System.out.println("\n*Extraccion Rapida*");
        do {
            System.out.println("Puedes retirar hasta " + lim + "$, ingresar monto > ");
            extraccion = leer.nextDouble();
            if(extraccion > lim) {
                System.out.println("Esa cantidad supera el limite, intenta de nuevo");
            }
        } while (extraccion > lim);
        
        cB.retirar(extraccion);
    }
    
    public void consultarSaldo(CuentaBancaria cB) {
        System.out.println("\nTu saldo actual es de: " + cB.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cB) {
        System.out.println("\nDatos de Cuenta:\n" + cB);
    }
}