package main;

import main.entity.Profesor;
import main.entity.ProfesorPrimaria;
import main.service.AlumnoService;

public class Main {

    static Profesor p = new ProfesorPrimaria();
    
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        
        System.out.println("Lista sin ordenar:");
        as.mostrarAlumnos();
        System.out.println("");
        
        as.ordenarPorNota();
        System.out.println("Lista ordenada descendentemente:");
        as.mostrarAlumnos();
        
        p.cambiarCurso(53465);
        p.hacerAlgo();
    }
    
    
    
}
