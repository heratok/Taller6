package modelo;

public class empleado {
    private String nombre;

    public empleado(String nombre) {
        this.nombre = nombre;
    }

    public empleado() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Empleado " + nombre ;
    }
    
}
