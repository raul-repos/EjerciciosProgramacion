public class Main {

    public static void main(String[] args) {
        int numUntil7 = 0;
        double randomNum;
        do{
        randomNum = Math.floor(Math.random()*10+1);
        numUntil7++;
            System.out.println(randomNum);
            //System.out.println(numUntil7);
        } while (randomNum != 7);
        System.out.println("Han hecho falta " + numUntil7 + " iteraciones para que saliera un 7");
    }
}
