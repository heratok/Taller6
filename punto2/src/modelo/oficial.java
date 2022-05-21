package modelo;

public class oficial extends operario{

    public oficial(String nombre) {
        super(nombre);
    }

    public oficial() {
    }
    
    @Override
    public String toString() {
        return super.toString()+" - > Oficial"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
