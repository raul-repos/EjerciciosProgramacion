import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String arrTextos = lector.nextLine();
        StringBuilder listado = new StringBuilder();
        while(!arrTextos.equals("FIN")){
            listado.append(arrTextos.toUpperCase());
            listado.append(";");
            System.out.println("Longitud: " + arrTextos.length());

            arrTextos = lector.nextLine();

        }

        lector.close();
        System.out.println(listado);

    }
}

/**
 * Escribe un programa Java que funcione de acuerdo a las siguientes especificaciones:
 *
 * Debe permitir al usuario introducir varios textos terminando cuando escriba la palabra FIN.
 * Cada texto debe guardarse en un objeto de tipo String.
 *
 *
 * Por cada texto introducido (menos la palabra FIN) el programa debe informar del número de caracteres.
 * Se deben ir concatenando todos los textos introducidos convertidos a mayúsculas (menos la palabra FIN)
 * en un objeto de tipo StringBuilder.
 *
 * Dentro del objeto StringBuilder cada texto nuevo debe terminar con el carácter punto y coma.
 * Por último, debemos utilizar un objeto de la clase StringTokenizer para volver a mostrar
 * los textos introducidos en líneas separadas.
 */