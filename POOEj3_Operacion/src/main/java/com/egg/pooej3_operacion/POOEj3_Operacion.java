/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.egg.pooej3_operacion;

import Entidad.Operacion;
import Servicio.ServicioOperacion;

/**
 *
 * @author zero
 */
public class POOEj3_Operacion {

    public static void main(String[] args) {
        ServicioOperacion serOp = new ServicioOperacion();
        Operacion parDeNumeros = serOp.crearOperacion();
        
        System.out.println("Esta es la suma: " + parDeNumeros.sumar()
        + "\nY la resta: " + parDeNumeros.restar() + "\nSu producto: " 
        + parDeNumeros.multiplicar() + "\nSu division resulta: " + parDeNumeros.dividir());
    }
}
