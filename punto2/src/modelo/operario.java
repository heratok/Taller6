package modelo;

public class operario extends empleado{

    
    public operario(String nombre) {
        super(nombre);
    }

    public operario() {
    }

    @Override
    public String toString() {
        return super.toString()+" - > Operario"; //To change body of generated methods, choose Tools | Templates.
    }

}
