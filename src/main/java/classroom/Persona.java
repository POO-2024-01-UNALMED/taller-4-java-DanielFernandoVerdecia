package classroom;

public class Persona {

    private long cedula = 0;
    String nombre;
    static int totalPersonas;
    static int sinCedula = 0;
    
    static {
    	
        totalPersonas = 0;
        
    }
    
    public Persona() {
    	
    	this.nombre = "";
    	this.cedula = sinCedula;
    	totalPersonas++;
    	sinCedula++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = sinCedula;
        totalPersonas++;
        sinCedula++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
