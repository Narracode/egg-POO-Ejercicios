package Servicio;

import Entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        Persona nP = new Persona();
        
        System.out.print("Bienvenido al asistente para crear nueva persona en "
                + "el sistema.\nIngrese el nombre de la persona > ");
        nP.setNombre(leer.next());
        System.out.println("Ahora ingrese la edad > ");
        nP.setEdad(leer.nextInt());
        String sex;
        do {
            System.out.println("Ingrese el sexo:\nH - Hombre\nM - Mujer\nO - Otro");
            sex = leer.next().toUpperCase();
            if (sex.equals("H") || sex.equals("M") || sex.equals("O")) {
                nP.setSexo(sex);
            } else {
                System.out.println("Invalido, intenta otra vez.");
            }
        } while (!sex.equals("H") && !sex.equals("M") && !sex.equals("O"));
        System.out.print("Peso de la persona en Kilos > ");
        nP.setPeso(leer.nextDouble());
        System.out.println("Altura de la persona en Metros > ");
        nP.setAltura(leer.nextInt());
        return nP;
    }
    
    public void IMC(Persona p) {
        String msj = p.getNombre() + " presenta ";
        switch(p.calcularIMC()) {
            case -1: System.out.println(msj + "peso debajo del ideal");break;
            case 0: System.out.println(msj + "el peso ideal");break;
            case 1: System.out.println(msj + "sobrepeso");break;
        }
    }
    
    public void verificarAdulto(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es un adulto");
        } else {
            System.out.println(p.getNombre() + " no puede comprar cerveza");
        }
    }
}
