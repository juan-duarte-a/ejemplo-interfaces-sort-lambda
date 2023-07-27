package main.service;

import main.entity.Alumno;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlumnoService {
    
    List<Alumno> alumnos = new ArrayList<>();

    public AlumnoService() {
        alumnos.add(new Alumno(5));
        alumnos.add(new Alumno(1));
        alumnos.add(new Alumno(2));
        alumnos.add(new Alumno(0));
        alumnos.add(new Alumno(5));
        alumnos.add(new Alumno(4));
        alumnos.add(new Alumno(5));
    }
        
    public void ordenarPorNota() {
        alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());
    }
    
    public void mostrarAlumnos() {
        alumnos.forEach(System.out::println);
        
        long cantidadAlumnosAprobados = alumnos.stream().filter(a -> a.getNota() >= 3).count();
        System.out.println("\nCantidad de alumnos aprobados: " + cantidadAlumnosAprobados);
    }
    
}
