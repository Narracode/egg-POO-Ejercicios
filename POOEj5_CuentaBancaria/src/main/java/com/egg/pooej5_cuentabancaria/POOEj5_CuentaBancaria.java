package com.egg.pooej5_cuentabancaria;

import Entidad.CuentaBancaria;
import Servicio.ServicioCuentaBancaria;

/**
 *
 * @author zero
 */
public class POOEj5_CuentaBancaria {

    public static void main(String[] args) {
        ServicioCuentaBancaria serCBanc = new ServicioCuentaBancaria();
        CuentaBancaria cuenta = serCBanc.crearCuenta();
        
        serCBanc.hacerRetiro(cuenta);
        serCBanc.hacerExtraccionRapida(cuenta);
        serCBanc.hacerDeposito(cuenta);
        serCBanc.consultarSaldo(cuenta);
        serCBanc.consultarDatos(cuenta);
    }
}
