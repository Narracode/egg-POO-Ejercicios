package com.egg.pooej11_date;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class POOEj11_Date {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Bienvenido.\nDigite un dia del mes > ");
        int dia = leer.nextInt();
        System.out.print("Ahora ingrese el numero que corresponda a un mes > ");
        int mes = leer.nextInt();
        System.out.print("Por favor, digita un año > ");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);
        Date hoy = new Date();
        System.out.println(hoy);
        int transcurridos = fecha.getYear() - hoy.getYear();
        System.out.println("Han pasado " + Math.abs(transcurridos) + " años");
        
    }
}
