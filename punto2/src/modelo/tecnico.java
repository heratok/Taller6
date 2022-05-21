package modelo;

public class tecnico extends operario{

    public tecnico(String nombre) {
        super(nombre);
    }

    public tecnico() {
    }

    @Override
    public String toString() {
        return super.toString()+" - > Tecnico"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
