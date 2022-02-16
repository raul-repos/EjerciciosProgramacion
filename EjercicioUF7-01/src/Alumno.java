import java.util.ArrayList;
import java.util.Iterator;

public class Alumno {
    private String nombre;
    private ArrayList<Calificacion> calificaciones;
    private int matricula;

    public Alumno(String nombre, int matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        calificaciones = new ArrayList<Calificacion>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public int getMatricula() {
        return matricula;
    }

    public void calificar(String asignatura, int nota){
        calificaciones.add(new Calificacion(asignatura,nota));
    }

    @Override
    public String toString(){
        return "Alumno: " + getNombre() + " - Matricula: " + getMatricula();
    }



}

