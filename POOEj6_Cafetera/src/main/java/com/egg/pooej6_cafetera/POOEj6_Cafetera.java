package com.egg.pooej6_cafetera;
import Entidad.Cafetera;
import Servicio.ServicioCafetera;

/**
 *
 * @author zero
 */
public class POOEj6_Cafetera {

    public static void main(String[] args) {
        Cafetera cafeteraLobby = new Cafetera();
        ServicioCafetera serCaf = new ServicioCafetera();
        
        serCaf.llenar(cafeteraLobby);
        serCaf.servir(cafeteraLobby);
        serCaf.agregar(cafeteraLobby);
        serCaf.vaciar(cafeteraLobby);
    }
}
