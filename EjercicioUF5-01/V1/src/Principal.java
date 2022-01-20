import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args){
        Fiesta laFiesta = new Fiesta();
        System.out.println(laFiesta.precioFiesta());
        laFiesta.cancelarInvitacion();
        laFiesta.consultar();

        Fiesta laFiesta2 = new Fiesta("Guateque", LocalDateTime.now(), "Calle Gran Via 24, Madrid",2,3 );
        laFiesta2.invitar();



    }
}
