package main.entity;

public class Alumno {
    
    private final int nota;

    public Alumno(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
    
    @Override
    public String toString() {
        return "" + nota;
    }
    
}
