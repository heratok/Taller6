package modelo;

public class directivo extends empleado {

    public directivo(String nombre) {
        super(nombre);
    }

    public directivo() {
    }

    @Override
    public String toString() {

        return super.toString() + " - > Directivo"; //To change body of generated methods, choose Tools | Templates.
    }

}
