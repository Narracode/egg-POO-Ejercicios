package com.egg.pooej14_movil;

import Entidad.Movil;
import Servicio.ServicioMovil;

/**
 *
 * @author zero
 */
public class POOEj14_Movil {

    public static void main(String[] args) {
        ServicioMovil serMov = new ServicioMovil();
        Movil m = serMov.crearMovil();
        
        System.out.println(m);
        serMov.mostrarCodigo(m);
    }
}