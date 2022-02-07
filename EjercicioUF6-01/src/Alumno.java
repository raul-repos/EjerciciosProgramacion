public class Alumno extends Persona {
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    protected String llamar(Persona p) {
        return (this.getNombre() + " esta llamando a "+ p);
    }

    protected String llamar (String p){
        return (this.getNombre() + " esta llamando a " + p);
    }


    @Override
    protected String trabajar() {
        return ("El alumno " + this.getNombre() + " va a estudiar " + this.getCurso());
    }

    public String hacerExamen(){
        return ("El alumno " + this.getNombre() + " va a hacer su examen");
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                "NIF='" + getNIF() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                '}';
    }

    public Alumno() {
    }
    public Alumno (String NIF, String nombre, String direccion, String telefono) {
        super(NIF, nombre, direccion, telefono);
    }

}
