package Entidad;

/**
 *
 * @author zero
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    
}
