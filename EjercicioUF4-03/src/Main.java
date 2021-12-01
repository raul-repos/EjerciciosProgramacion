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
        StringTokenizer result = new StringTokenizer(listado.toString(),";"); // Como las ; están metidas ad hoc y no forman parte del texto, NO añado TRUE para incluirlas
        while (result.hasMoreTokens()){
            System.out.println(result.nextToken());
        }
    }
}

