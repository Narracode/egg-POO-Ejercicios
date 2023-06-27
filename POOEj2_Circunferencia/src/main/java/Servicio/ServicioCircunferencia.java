package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class ServicioCircunferencia {
    public Circunferencia crearCircun() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digita una medida para el radio > ");
        double radio = leer.nextDouble();
        
        Circunferencia c = new Circunferencia(radio);
        
        return c;
    }
    public void area(Circunferencia c) {
        double r = c.getRadio(), pi = 3.1416;
        double area = r*r*pi;
        
        System.out.println("El area del circulo es: " + area + " unidades");
    }
    
    public void perimetro(Circunferencia c) {
        double r = c.getRadio(), pi = 3.1416;
        double perimetro = 2*pi*r;
        System.out.println("El perimetro de la circunferencia es: " + perimetro
        + " unidades");
    }
}