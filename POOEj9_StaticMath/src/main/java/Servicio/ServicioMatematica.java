package Servicio;
import Entidad.Matematica;

/**
 *
 * @author zero
 */
public class ServicioMatematica {
    public Matematica crearMatematica() {
        Matematica m = new Matematica();
        m.setNumA((Math.random() * 10) * (Math.random() * 10) + Math.random());
        m.setNumB((Math.random() * 10) * (Math.random() * 10) + Math.random());
        return m;
    }
    
    public void mostrarMayor(Matematica mtm) {
        System.out.println("Siendo A " + mtm.getNumA() + " y B " + mtm.getNumB()
        + " el mayor es:" + mtm.devolverMayor());
    }
    
    public void potenciaDelMayorALaMenor(Matematica mtm) {
        mostrarMayor(mtm);
        System.out.println("Redondeando los dos numeros, elevamos el mayor a la"
            + " potencia del otro numero obtenemos: " + mtm.calcularPotencia());
    }
    
    public void raizDelMenor(Matematica mtm) {
        mostrarMayor(mtm);
        System.out.println("La raiz cuadrada del menor numero es: "
            + mtm.calcularRaiz());
    }
}
