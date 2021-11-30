public class Main {


    public static void main (String[] args) {
        double num1 = Math.floor(Math.random()*20+1);
        double num2 =  (num1>= 5 && num1 <=20)?num1+15:num1+5; // Me parece menos legible así, pero por practicar
        System.out.println("El valor generado al azar es " +num1);
        System.out.println("El valor de num2 es " + num2);

    }
}
