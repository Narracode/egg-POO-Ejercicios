/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.egg.pooej13_curso;

import Entidad.Curso;
import Servicio.ServicioCurso;

/**
 *
 * @author zero
 */
public class POOEj13_Curso {

    public static void main(String[] args) {
        ServicioCurso serCur = new ServicioCurso();
        Curso c = serCur.crearCurso();
        
        serCur.mostrarGanancia(c);
    }
}
