public class Main {

    public static void main(String[] args) {
	double randomNum = Math.floor(Math.random()*10+1);
    if (randomNum > 5){
        System.out.println("Hoy va a ser un gran día");
    } else {
        System.out.println("Hoy va a ser el mejor día del mundo");
    }
    }
}
