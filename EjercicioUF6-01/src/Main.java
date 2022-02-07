public class Main {
    public static void  main (String[] args){

        // No uso el constructor parametrizado porque creo que queda mas claro asi

        Profesor prof = new Profesor();
        prof.setNombre("Raul Cimas");
        prof.setDireccion("P Sherman calle Wallaby 42 Sidney");
        prof.setNIF("48632842K");
        prof.setTelefono("654321871");

        Alumno alum = new Alumno();
        alum.setNombre("Joaquin Reyes");
        alum.setCurso("primer curso de Efepe");
        alum.setDireccion("P Sherman calle Wallaby 42 BIS Sidney");
        alum.setNIF("48632842S");
        alum.setTelefono("658987321");

        Administrativo admin = new Administrativo();
        admin.setNombre("Ernesto Sevilla");
        admin.setDireccion("P Sherman calle Wallaby 42 Melbourne");
        admin.setNIF("48632842F");
        admin.setTelefono("654654654");
        admin.setTareas("Poner una lavadora, tender la ropa, planchar");

        /*
         * El enunciado pide simplemente que se devuelva la información.
         * La muestro por consola para mayor claridad
         */
        System.out.println(alum.toString());
        System.out.println(" ");
        System.out.println(prof.toString());
        System.out.println(" ");
        System.out.println(admin.toString());
        System.out.println(" ");

        System.out.println(alum.llamar(prof.getNombre()));
        System.out.println(" ");
        System.out.println(prof.ponerNotas());
        System.out.println(" ");
        System.out.println(alum.hacerExamen());
        System.out.println(" ");
        System.out.println(admin.gestionarMatricula());



    }
}
