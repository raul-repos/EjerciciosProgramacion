import java.time.LocalDateTime;
import com.itt.fiestas.Fiestav2;

public class Principalv2 {
    public static void main(String[] args){
        Fiestav2 laFiesta = new Fiestav2();
        System.out.println(laFiesta.precioFiesta());
        laFiesta.cancelarInvitacion();
        laFiesta.consultar();

        Fiestav2 laFiesta2 = new Fiestav2("Guateque", LocalDateTime.now(), "Calle Gran Via 24, Madrid",2,3 );
        laFiesta2.invitar();

        laFiesta.contadorFiestas();

        laFiesta2.consultar();
        laFiesta2.invitar(5);
        laFiesta2.consultar();


    }
}
