package com.egg.pooej8_cadena;

import Entidad.Cadena;
import Servicio.ServicioCadena;
/**
 *
 * @author zero
 */
public class POOEj8_Cadena {

    public static void main(String[] args) {
        ServicioCadena serCad = new ServicioCadena();
        Cadena c = serCad.crearCadena();
        
        serCad.contarVocales(c);
        serCad.voltear(c);
        serCad.buscarLetra(c);
        serCad.comparar(c);
        serCad.unirNuevaFrase(c);
        serCad.reemplazarA(c);
        serCad.contieneLetra(c);
    }
}
