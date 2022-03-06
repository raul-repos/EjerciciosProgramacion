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

        try {
            dinero = Integer.parseInt(lector.nextLine());
            if (miCuenta.getSaldo() < dinero)
                throw new NumerosRojosException();
            miCuenta.agregarMovimiento("Retirada de fondos", -dinero);
            lector.close();
        } catch (NumerosRojosException e){
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("El valor introducido no es un numero");
        } finally {
            System.out.println(miCuenta);
            System.out.println(miCuenta.listarMovimientos());
        }
    }
}


