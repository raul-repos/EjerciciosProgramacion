public class Profesor extends Persona {

    public Profesor() {
    }

    public Profesor (String NIF, String nombre, String direccion, String telefono) {
        super(NIF, nombre, direccion, telefono);
    }

    @Override
    protected String llamar(Persona p) { // Parametro tipo Persona porque lo pide el ejercicio
        return (this.getNombre() + " esta llamando a "+ p);
    }

    protected String llamar (String p){
        return (this.getNombre() + " esta llamando a " + p);
    }

    @Override
    protected String trabajar() {
        return ( "El profesor " + this.getNombre() + " va a impartir su clase");
    }

    public String ponerNotas(){
        return ( "El profesor " + this.getNombre() + " va a corregir los examenes");
    }

}
