package Entidad;

/**
 *
 * @author zero
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    

    public String[] letras() {
        String[] letras = this.frase.split("");
        return letras;
    }

    public int mostrarVocales() {
        int incidencias = 0;
        
        for (String letra : letras()) {
            switch(letra.toLowerCase()) {
                case "a": case "e": case "i": case "o": case "u":
                    incidencias ++; break;
            }
        }
        return incidencias;
    }

    public String invertirFrase() {
        String alreves = "";
        for (int i = 0; i < longitud; i++) {
            alreves += frase.substring(longitud-1-i, longitud-i);
        }
        return alreves;
    }
    
    public int vecesRepetido(String letra) {
        int incidencias = 0;
        
        for (String l : letras()) {
            if (letra.equalsIgnoreCase(l)) {
                incidencias++;
            }
        }
        return incidencias;
    }
    
    public int compararLongitud(String frase) {
        int diferencia = this.longitud - frase.length();
        return diferencia;
    }
    
    public String unirFrases(String frase) {
        String nF = " ";
        nF = nF.concat(frase);
        String unidas = this.frase.concat(nF);
        return unidas;
    }

    public String reemplazar(String letra) {
        String r = "";
        for (String l : letras()) {
            if (l.equalsIgnoreCase("a")) {
                l = letra;
            }
            r = r.concat(l);
        }
        return r;
    }

    public boolean contiene(String letra) {
        boolean r = this.frase.contains(letra);
        return r;
    }
}
