import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void totalNotas(Alumno unAlumno){
        Iterator<Calificacion> iterator = unAlumno.getCalificaciones().iterator();
        Calificacion cadaCalificacion;
        int numAsignaturas = 0;
        int notaTotal = 0;
        while (iterator.hasNext()){
            cadaCalificacion = iterator.next();
            System.out.println(cadaCalificacion.getAsignatura() + ": " + cadaCalificacion.getNota());
            numAsignaturas ++;
            notaTotal = notaTotal + cadaCalificacion.getNota();
        }
        System.out.println("Nota Media:" + (notaTotal/numAsignaturas));

    }
    public static void main(String[] args){
        Alumno alum = new Alumno("Carmen Torres", 31553);
        alum.calificar("Matematicas", 70);
        alum.calificar("Lengua", 55);
        alum.calificar("Ingles", 93);
        alum.calificar("Fisica",82);
        alum.calificar("Educacion Fisica", 82);
        alum.calificar("Biologia", 58);

        System.out.println(alum.toString());
        totalNotas(alum);

    }
}
