package main.entity;

import java.util.ArrayList;
import java.util.List;

public class ProfesorPrimaria implements Profesor {

    @Override
    public List<Alumno> obtenerAlumons() {
        return new ArrayList<>();
    }

    @Override
    public void cambiarCurso(long id) {
        System.out.println("Cambia al curso " + id);
    }
    
}
