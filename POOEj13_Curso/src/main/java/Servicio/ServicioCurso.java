package Servicio;
import Entidad.Curso;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioCurso {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            int id = i+1;
            System.out.print("Ingrese el nombre del alumno " + id + " > ");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    
    public Curso crearCurso() {
        Curso c = new Curso();
        System.out.print("*Bienvenido*\nIngresa el nombre del nuevo curso > ");
        c.setNombreCurso(leer.next());
        System.out.println("¿Cuantas horas dura la clase?");
        c.setCantidadHorasPorDia(leerCantidad(1,6));
        System.out.println("¿Cuantas sesiones por semana son necesarias?");
        c.setCantidadDiasPorSemana(leerCantidad(1,6));
        System.out.println("¿En que turno se imparte el curso? 1 = Mañana"
            + " 2 = Tarde");
        c.setTurno(leerCantidad(1,2));
        System.out.println("Precio por Hora en USD: ");
        c.setPrecioPorHora(leerCantidad(3,50));
        System.out.println("Ahora registraremos a los alumnos:");
        c.setAlumnos(cargarAlumnos());
        return c;
    }
    
    public int leerCantidad(int min, int max) {
        int r;
        do {
            System.out.println("Ingresa una cantidad entre " + min + " y "
                + max + " > ");
            r = leer.nextInt();
            if (r < min || r > max) {
                System.out.println("Invalido, intenta otra vez.");
            }
        } while (r < min || r > max);
        return r;
    }
    
    public void mostrarGanancia(Curso c) {
        System.out.println("Este curso generara ingresos semanales por la"
                + " cantidad de: USD$ " + c.calcularGananciaSemanal());
    }
}
