package com.egg.pooej7_persona;
import Entidad.Persona;
import Servicio.ServicioPersona;
/**
 *
 * @author zero
 */
public class POOEj7_Persona {

    public static void main(String[] args) {
        ServicioPersona serPer = new ServicioPersona();
        
        Persona p1 = new Persona("Pablito Molinar", 37, "H", 80, 1.80);
        Persona p2 = new Persona("Marisol Cortes", 16, "M", 36, 1.56);
        Persona p3 = new Persona("Luna Wong", 22, "O", 96.3, 1.76);
        Persona p4 = new Persona("Jessica Rabbit", 27, "M", 57, 1.60);
        Persona[] grupo = {p1, p2, p3, p4};
        for (Persona p : grupo) {
            serPer.IMC(p);
            serPer.verificarAdulto(p);
        }
        
        int adultos = 0, bajoPeso = 0, pesoIdeal = 0, sobrePeso = 0;
        for (Persona p : grupo) {
            if(p.esMayorDeEdad()) {
                adultos ++;
            }
            switch(p.calcularIMC()) {
                case -1: bajoPeso++;break;
                case 0: pesoIdeal++;break;
                case 1: sobrePeso++;break;
            }
        }
        
        int m = grupo.length;
        String msj = "\nPorcentaje de personas ";
        System.out.println(msj + "con bajo peso: " + porcentaje(bajoPeso,m)
            + "%" + msj + "con peso ideal: " + porcentaje(pesoIdeal,m)
            + "%" + msj + "con sobrepeso: " + porcentaje(sobrePeso,m)
            + "%" + msj + "adultas: " + porcentaje(adultos,m) + "%" + msj
            + "menores de edad: " + porcentaje((m-adultos),m)+ "%");
    }
    
    public static int porcentaje(int incidencias, int muestra) {
        int p = (incidencias*100/muestra);
        return p;
    }
}
