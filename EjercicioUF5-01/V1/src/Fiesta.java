import java.time.LocalDateTime;

public class Fiesta {
    //Encapsulamiento de las propiedades con el modificador private
    private String tipo;
    private int bocadillos;
    private int bebidas;
    private LocalDateTime fechaHora;
    private int invitados;
    private String direccion;

    // Getter y Setter
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String newTipo){
        this.tipo = newTipo;
    }
    public LocalDateTime getFechaHora(){
        return fechaHora;
    }
    public void setFechaHora(LocalDateTime newFechaHora){
        this.fechaHora = newFechaHora;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String newDireccion){
        this.direccion = newDireccion;
    }
    public int getBocadillos(){
        return bocadillos;
    }
    public void setBocadillos(int newBocadillos){
        this.bocadillos = newBocadillos;
    }
    public int getBebidas(){
        return bebidas;
    }
    public void setBebidas(int newBebidas){
        this.bebidas = newBebidas;
    }
    public int getInvitados(){
        return invitados;
    }
    public void setInvitados(int newInvitados){
        this.invitados = newInvitados;
    }

    //Metodos constructores
    // Constructor estandar
    public Fiesta(){
        tipo = "Fiestuqui";
        bocadillos = 3;
        bebidas = 9999;
        fechaHora = LocalDateTime.of(2022,03,15,21,45);
        invitados = 5;
        direccion = "P Sherman calle Wallaby 42 Sidney";

    }
    // Constructor parametrizado
    public Fiesta(String tipo,
                  LocalDateTime fechaHora,
                  String direccion,
                  int bocadillos,
                  int bebidas){
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.direccion = direccion;
        this.bocadillos = bocadillos;
        this.bebidas = bebidas;
        invitados = 0;
    }

    //Otros metodos
    public void consultar(){ // Pinta por pantalla el resultado
        System.out.println("Tipo: " + tipo
                + ", Direccion: " + direccion
                + ", Nº bocadillos : " + bocadillos
                + ", Nº bebidas: " + bebidas
                + ", fecha: " + fechaHora
                + " invitados: " + invitados);
    }

    public void invitar(){
        this.invitados +=1;
    }

    public void cancelarInvitacion(){
        this.invitados -=1;
    }
    public int precioFiesta(){ // Retorna el valor
        return invitados*5 + bebidas*2 + bocadillos*3;
    }
}
