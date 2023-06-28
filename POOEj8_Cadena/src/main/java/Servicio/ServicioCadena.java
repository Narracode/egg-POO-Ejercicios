package Servicio;
import java.util.Scanner;
import Entidad.Cadena;
        
/**
 *
 * @author zero
 */
public class ServicioCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        Cadena c = new Cadena();
        System.out.print("Ingresa una frase > ");
        String frase = leer.next();
        
        c.setFrase(frase);
        c.setLongitud(frase.length());
        
        return c;
    }
    
    public void contarVocales(Cadena c) {
        System.out.println("La cadena contiene: " + c.mostrarVocales() + " vocales\n");
    }
    
    public void voltear(Cadena c) {
        System.out.println(original(c) + "Invertida: \""
            + c.invertirFrase() + "\"\n");
    }
    
    public void buscarLetra(Cadena c) {
        String letra;
        do {
            System.out.print("Ingresa la letra a buscar > ");
            letra = leer.next();
            if (letra.length() != 1) {
                System.out.println("Invalido, intenta otra vez");
            }
        } while(letra.length() != 1);
        System.out.println(original(c) + "El caracter \'" + letra + "\' "
                + "Se repite " + c.vecesRepetido(letra) + " veces.\n");
    }
    
    public void comparar(Cadena c) {
        System.out.print("Teclea una nueva frase > ");
        String nF = leer.next();
        String suf = "La nueva frase: \"" + nF  + "\"\n";
        String msj = "";

        int dif = c.compararLongitud(nF);
        if (dif == 0) {
            msj = "Es de igual longitud.";
        }
        if (dif > 0) {
            msj = "Es mas corta por " + dif + " caracteres.";
        }
        if (dif < 0) {
            msj = "Es mas larga por " + Math.abs(dif) + " caracteres.";
        }
        System.out.println(original(c) + suf + msj + "\n");
    }
    
    public void unirNuevaFrase(Cadena c) {
        System.out.print("Teclea una nueva frase > ");
        String nF = c.unirFrases(leer.next());
        String msj = "La nueva frase: \"" + nF  + "\"\n";

        System.out.println(original(c) + msj);
    }
    
    public void reemplazarA(Cadena c) {
        System.out.print("Teclea una letra para cambiarla por las \'a\'en la frase > ");
        String nF = c.reemplazar(leer.next());
        String msj = "La nueva frase: \"" + nF  + "\"\n";

        System.out.println(original(c) + msj);
    }
    
    public void contieneLetra(Cadena c) {
        String msj = "La cadena contiene esa letra: ";
        System.out.print("Teclea una letra a buscar > ");
        if (c.contiene(leer.next())) {
            System.out.println(msj + "Verdadero");
        } else {
            System.out.println(original(c) + msj + "Falso");
        }
    }

    public String original(Cadena c) {
        String msj = "Original: \"" + c.getFrase() + "\"\n";
        return msj;
    }
}
