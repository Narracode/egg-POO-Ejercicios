/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.egg.pooej12_personadate;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author zero
 */
public class POOEj12_PersonaDate {

    public static void main(String[] args) {
        ServicioPersona serPer = new ServicioPersona();
        Persona p = serPer.crearPersona();
        
        serPer.mostrarEdad(p);
        serPer.esMenor(p);
        serPer.mostrarPersona(p);
    }
}
