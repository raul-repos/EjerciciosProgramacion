public class Profesor extends Persona {

    @Override
    protected String llamar(Persona p) { // Parametro tipo Persona porque lo pide el ejercicio
        return (this.getNombre() + " esta llamando a "+ p);
    }
    /*
     * He intentado sobrecargar este metodo para poder devolver solo el nombre y no
     * el objeto entero, pero no he sido capaz sin modificar la clase Persona
     *
    protected String llamar (String p){
        return (this.getNombre() + " esta llamando a " + p);
    }
    *
    */

    @Override
    protected String trabajar() {
        return ( "El profesor " + this.getNombre() + " va a impartir su clase");
    }

    public String ponerNotas(){
        return ( "El profesor " + this.getNombre() + " va a corregir los examenes");
    }

    public Profesor() {
    }
}
