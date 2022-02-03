import com.itt.libreria.*;

public class Principal {
    public static void main(String[] arg){
        Autor cervantes = new Autor("Miguel", "Un tipo manco que escribia libros.");

        Libro novelasEjemplares = new Libro("Novelas Ejemplares", "Relato corto", cervantes );

        System.out.println(novelasEjemplares.toString());
        System.out.println(" ");
        novelasEjemplares.getAutor().setBiografia("Cervantes era zurdo hasta que tuvo que dejar de serlo");
        System.out.println(" ");
        System.out.println(novelasEjemplares.getAutor().toString());
        System.out.println(" ");
        System.out.println(cervantes.toString());
        System.out.println(" ");
        novelasEjemplares.setGenero("Eglogas");
        System.out.println(novelasEjemplares.toString());
    }
}
