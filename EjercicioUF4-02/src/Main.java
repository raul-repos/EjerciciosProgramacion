import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void  triangulo(String texto) {
        String newArr = texto.substring(0,texto.length()-1);

        if (texto.length() == 1) {
            return;
        } else {
            triangulo(newArr);
        }
        System.out.println(newArr);
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Escribe un texto: ");
        frase = lector.nextLine();
        lector.close();

        if (frase.length() == 0){ // Comprobación de que efectivamente hay input
            System.out.println("Un texto vacío no es valido");
            return;
        }

        int len = frase.length();

        // 1. Mostrar por pantalla la longitud del texto
        System.out.println("Longitud: " + len);

        // 2. Mostrar por pantalla el texto en mayusclas
        System.out.println("Mayusculas: " + frase.toUpperCase());

        // 3. Mostrar por pantalla cada cada palabra en una línea mediante .split()
        String[] palabra = frase.split(" ");
        for (int i = 0; i < palabra.length; i++){
            System.out.println(palabra[i]);
        }
        // 4. Contar el numero de letras minusculas
        String[] arrayletra = frase.split("");
        int minusculaCounter = 0;
        char letra;
        for ( int i = 0; i < arrayletra.length; i++){
            letra = arrayletra[i].charAt(0);
            if (Character.isLowerCase(letra)){
                minusculaCounter++;
            }
        }
        System.out.println("El texto tiene " + minusculaCounter + " minusculas");

        // 4. Mostrar por pantalla triángulo con las letras del texto

        /** Mediante recursividad
         * (No consigo hacer el triángulo decreciente porque no se como gestionar el stack que genera
         * la recursividad)
         */
        triangulo(frase);

        /** Mediante iteracion
         */
        do {
            System.out.println(frase);
            frase = frase.substring(0,frase.length()-1);
         } while(frase.length() > 1);

    }
}


