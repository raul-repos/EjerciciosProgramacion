public class Administrativo extends Persona{
    private String tareas;

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    @Override
    protected String llamar(Persona p) {
        return (this.getNombre() + " esta llamando a "+ p);
    }

    @Override
    protected String trabajar() {
        return ("El administrativo " + getNombre() + " va a realizar estas tareas: " + getTareas());
    }

    public String gestionarMatricula(){
        return ("El administrativo " + getNombre() + " va a gestionar una matricula");
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "tareas='" + tareas + '\'' +
                "NIF='" + getNIF() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                '}';
    }

    public Administrativo() {
    }
}
