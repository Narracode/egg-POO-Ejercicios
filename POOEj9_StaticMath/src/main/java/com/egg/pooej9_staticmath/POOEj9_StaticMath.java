package com.egg.pooej9_staticmath;
import Entidad.Matematica;
import Servicio.ServicioMatematica;
/**
 *
 * @author zero
 */
public class POOEj9_StaticMath {

    public static void main(String[] args) {
        ServicioMatematica serMat = new ServicioMatematica();
        Matematica mtm = serMat.crearMatematica();
        
        serMat.mostrarMayor(mtm);
        serMat.potenciaDelMayorALaMenor(mtm);
        serMat.raizDelMenor(mtm);
    }
}
