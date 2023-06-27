package com.egg.pooej1_libro;
import Entidad.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author zero
 */
public class POOEj1_Libro {

    public static void main(String[] args) {
        ServicioLibro serLib = new ServicioLibro();
        
        Libro l1 = serLib.cargarLibro();
        
        serLib.datosLibro(l1);
    }
}
