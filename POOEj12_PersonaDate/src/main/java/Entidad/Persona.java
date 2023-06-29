package Entidad;

import java.util.Date;

/**
 *
 * @author zero
 */
public class Persona {
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public int calcularEdad() {
        Date hoy = new Date();
        int edad = hoy.getYear() - this.fechaDeNacimiento.getYear();
        if(hoy.getMonth() < this.fechaDeNacimiento.getMonth()) {
            edad -= 1;
        }
        return edad;
    }
    
    public boolean menorQue(int edad) {
        boolean esMenor = calcularEdad() < edad;
        return esMenor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
}
