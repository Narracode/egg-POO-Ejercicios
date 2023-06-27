package com.egg.pooej4_rectangulo;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author zero
 */
public class POOEj4_Rectangulo {

    public static void main(String[] args) {
        ServicioRectangulo recSer = new ServicioRectangulo();
        Rectangulo rec = recSer.crearRectangulo();
        
        recSer.areaYPerimetro(rec);
        recSer.DibujarRectangulo(rec);
    }
}
