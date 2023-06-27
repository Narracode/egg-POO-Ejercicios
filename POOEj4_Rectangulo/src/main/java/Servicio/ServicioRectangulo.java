package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class ServicioRectangulo {
    
    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Bienvenido, Digita La altura de un rectangulo: ");
        r.setAltura(leer.nextInt());
        System.out.print("Digita ahora La longitud de la base: ");
        r.setBase(leer.nextInt());
        return r;
    }
    
    public void areaYPerimetro(Rectangulo r) {
                System.out.println("El area del rectangulo es: " + r.area() 
                    + "\nSu perimetro: " + r.perimetro());
    }

    public void DibujarRectangulo(Rectangulo r) {
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if(i == 0 || i == r.getAltura()-1 || j == 0 || j == r.getBase() -1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
                
                if (j == r.getBase() - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
}