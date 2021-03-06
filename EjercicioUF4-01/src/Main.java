import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String matrizIngles[][] = {
                {"bear", "oso"},
                {"cat", "gato"},
                {"cheetah", "guepardo"},
                {"dog", "perro"},
                {"eagle", "aguila"},
                {"fish", "pez"},
                {"frog", "rana"},
                {"horse", "caballo"},
                {"lion", "leon"},
                {"lizard", "lagarto"},
                {"meerkat", "suricata"},
                {"monkey", "mono"},
                {"orangutan", "orangutan"},
                {"panther", "pantera"},
                {"parrot", "loro"},
                {"pig", "cerdo"},
                {"tiger", "tigre"},
                {"toad", "sapo"},
                {"tortoise", "tortuga"},
                {"mare", "yegua"},
        };
        Scanner lector = new Scanner(System.in);
        int aciertos = 0;
        for (int i = 0; i < matrizIngles.length; i++) {
            String ingles = matrizIngles[i][0];
            String resultado = matrizIngles[i][1];
            String input;
            System.out.println("Traduce " + ingles + ":");
            input = lector.nextLine().toLowerCase();
            if (input.equals(resultado)){ // equals() en lugar de == por no estar alojado en la misma parte de la memoria
                System.out.println("Bien hecho!!");
                aciertos++;
            } else{
                System.out.println("No, la respuesta correcta es " + resultado);
            }
        }
        lector.close();
        System.out.println("Has tenido " + aciertos + " aciertos.");
        System.out.println("Has tenido " + (matrizIngles.length - aciertos) + " fallos.");
    }
}
