package com.egg.pooej10_arrays;

import java.util.Arrays;

/**
 *
 * @author zero
 */
public class POOEj10_Arrays {

    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        
        llenar(a);
        Arrays.sort(a);
        b = Arrays.copyOfRange(a, 0, 20);
        Arrays.fill(b, 10, 20, 0.5);
        mostrarArray(a);
        mostrarArray(b);
    }
    
    public static void llenar(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 10) * (Math.random() * 10) + Math.random();
        }
    }
    
    public static void mostrarArray(double[] a) {
        String aux = "";
        for (double d : a) {
            aux += d + " ";
        }
        System.out.println("Contenido del arreglo:\n" + aux);
    }
}
