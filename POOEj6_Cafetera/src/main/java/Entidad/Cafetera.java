package Entidad;

/**
 *
 * @author zero
 */
public class Cafetera {
    private int capacidadMaxima = 1200;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public int servirTaza(int capTaza) {
        int servido;
        if(capTaza > this.cantidadActual) {
            servido = this.cantidadActual;
        } else {
            servido = capTaza;
        }
        this.cantidadActual -= servido;
        return servido;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int agregar) {
        this.cantidadActual += agregar;
    }
}
