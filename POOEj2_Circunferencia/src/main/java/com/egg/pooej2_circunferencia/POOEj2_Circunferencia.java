package com.egg.pooej2_circunferencia;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

/**
 *
 * @author zero
 */
public class POOEj2_Circunferencia {

    public static void main(String[] args) {
        ServicioCircunferencia serCir = new ServicioCircunferencia();
        
        Circunferencia circulo = serCir.crearCircun();
        
        serCir.area(circulo);
        
        serCir.perimetro(circulo);
    }
}
