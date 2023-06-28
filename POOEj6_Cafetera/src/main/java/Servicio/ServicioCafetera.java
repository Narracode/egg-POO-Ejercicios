package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenar(Cafetera caf) {
        String r;
        do {
            System.out.print("¿Desea llenar la cafetera a su capacidad maxima? S/N > ");
            r = leer.next();
            if (r.equalsIgnoreCase("s")) {
                caf.llenarCafetera();                
            } else if(r.equalsIgnoreCase("n")) {
                System.out.println("Bye");
            } else {
                System.out.println("Invalido, intenta otra vez.");
            }
        } while(!r.equalsIgnoreCase("s") && !r.equalsIgnoreCase("n"));
    }
    
    public void servir(Cafetera caf) {
        System.out.print("Introduzca la capacidad de la taza en mililitros > ");
        int peticion = leer.nextInt();
        int despachar = caf.servirTaza(peticion);
        if (despachar == peticion) {
            System.out.println("Taza llena!");
        } else {
            System.out.println("Se han servido " + despachar + " ml en la taza");
        }
    }
    
    public void vaciar(Cafetera caf) {
        String r;
        do {
            System.out.print("¿Desea vaciar la cafetera? S/N > ");
            r = leer.next();
            if (r.equalsIgnoreCase("s")) {
                caf.vaciarCafetera();                
            } else if(r.equalsIgnoreCase("n")) {
                System.out.println("Bye");
            } else {
                System.out.println("Invalido, intenta otra vez.");
            }
        } while(!r.equalsIgnoreCase("s") && !r.equalsIgnoreCase("n"));
    }
    
    public void agregar(Cafetera caf) {
        System.out.print("Introduzca la cantidad a agregar en mililitros > ");
        int agregado = leer.nextInt();
        if (agregado + caf.getCantidadActual() > caf.getCapacidadMaxima()) {
            System.out.println("Rebasa el tanque! El excedente se descartara");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        } else {
            caf.agregarCafe(agregado);
            System.out.println("Hay " + caf.getCantidadActual() + " ml en el tanque");
        }
    }
}