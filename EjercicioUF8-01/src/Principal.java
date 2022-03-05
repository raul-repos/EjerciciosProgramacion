import java.io.IOException;
import java.util.Scanner;
public class Principal {


    public static void main(String args[]) throws NumberFormatException {

        Scanner lector = new Scanner(System.in);

        System.out.println

                ("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");

        CuentaBancaria miCuenta = new CuentaBancaria

                (38143, "Amelia González");


            miCuenta.agregarMovimiento("Ingreso inicial", 100);



        System.out.println("Cuánto dinero deseas retirar: ");

        int dinero;
            dinero = Integer.parseInt(lector.nextLine());

        //TODO
        miCuenta.agregarMovimiento("Retirada de fondos", -dinero);

        lector.close();

        System.out.println(miCuenta);

        System.out.println(miCuenta.listarMovimientos());

    }

}
