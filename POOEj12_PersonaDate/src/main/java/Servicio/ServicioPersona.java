package Servicio;
import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.print("Bienvenido. Ingrese el nombre de la persona > ");
        p.setNombre(leer.next());
        System.out.print("Ingrese año del siglo XX en el que nacio, eg: 1985 ="
            + "85, agregue 100 si nacio en el sigo XXI eg: 2001 = 101 > ");
        int anio = leer.nextInt();
        System.out.print("Digite el numero correpondiente al mes de nacimiento > ");
        int mes = leer.nextInt();
        System.out.print("Ahora el dia de nacimiento > ");
        int dia = leer.nextInt();
        p.setFechaDeNacimiento(new Date(anio, mes, dia));
        return p;
    }
    
    public void mostrarEdad(Persona p) {
        System.out.println(p.getNombre() + " cuenta con " + p.calcularEdad()
            + " años.");
    }
    
    public void esMenor(Persona p) {
        System.out.println("Ingrese la edad en años de otra persona > ");
        
        if (p.menorQue(leer.nextInt())) {
            System.out.println("Esa persona es mayor que " + p.getNombre());
        } else {
            System.out.println("Esa persona es menor que " + p.getNombre());
        }
    }
    
    public void mostrarPersona(Persona p) {
        System.out.println("Datos personales:\n" + p);
    }
}
