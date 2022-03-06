public class NumerosRojosException extends Exception{
    public NumerosRojosException() {
        super("El valor supera la cantidad de la cuenta");
    }
    public NumerosRojosException(String message){
        super(message);
    }
}
