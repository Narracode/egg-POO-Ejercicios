package Servicio;

import Entidad.Operacion;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioOperacion {
    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        Operacion op = new Operacion();
        
        System.out.print("Favor de introducir dos digitos para A y B: ");
        op.setNumero1(leer.nextDouble());
        op.setNumero2(leer.nextDouble());
        return op;
    }
}