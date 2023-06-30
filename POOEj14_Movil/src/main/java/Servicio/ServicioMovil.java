package Servicio;

import Entidad.Movil;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioMovil {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public int[] ingresarCodigo() {
        int[] codigo = new int[7];
        String c;
        
        do {
            System.out.print("Ingrese el codigo del Movil > ");
            c = leer.next();
            if (c.length() != 7) {
                System.out.println("El codigo debe tener 7 digitos");
            }
        } while (c.length() != 7);
        int i = 0;
        for (String dig : c.split("")) {
            codigo[i] = Integer.parseInt(dig);
            i++;
        }
        return codigo;
    }
    
    public Movil crearMovil() {
        Movil m = new Movil();
        System.out.print("*Bienvenido al asistente de carga de movil*\n"
            + "Ingrese la marca a la que pertenece la unidad > ");
        m.setMarca(leer.next());
        System.out.print("Precio actual del movil en USD > ");
        m.setPrecio(leer.nextInt());
        System.out.print("¿De que modelo se trata? > ");
        m.setModelo(leer.next());
        System.out.print("Cantidad redondeada de gb de memoria RAM > ");
        m.setMemoriaRam(leer.nextInt());
        System.out.print("Capacidad de almacenamiento interno en gb (redondeado) > ");
        m.setAlmacenamiento(leer.nextInt());
        m.setCodigo(ingresarCodigo());
        return m;
    }
    
    public void mostrarCodigo(Movil m) {
        System.out.println("Codigo del movil: ");
        String aux = "";
        for (Object dig : m.getCodigo()) {
            aux += dig + " ";
        }
        System.out.println(aux);
    }
}
