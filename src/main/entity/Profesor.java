package main.entity;

import java.util.List;

public interface Profesor {
    
    List<Alumno> obtenerAlumons();
    void cambiarCurso(long id);
    
    default void hacerAlgo() {
        System.out.println("Hace algo");
    }
}
