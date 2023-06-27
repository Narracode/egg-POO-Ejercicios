package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class ServicioLibro {
    public Libro cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Asistente para cargar libro");
        System.out.print("Digite el ISBN > ");
        int isbn = leer.nextInt();
        System.out.println("Escriba el titulo > ");
        String titulo = leer.next();
        System.out.println("Declare el Autor > ");
        String autor = leer.next();
        System.out.println("Cantidad de paginas > ");
        int pps = leer.nextInt();
        
        Libro libroCargar = new Libro(isbn, titulo, autor, pps);
        
        return libroCargar;
    }
    
    public void datosLibro(Libro l) {
        System.out.println("Datos del libro:\n"+l);
    }
}
