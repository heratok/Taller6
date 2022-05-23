package modelo;

public class profesorInterno extends profesor {

    private String fechaIncorporo;

    public profesorInterno() {
    }

    public profesorInterno(String Nombre, String Apellido, String Id, String FechaIncorporo) {
        super(Nombre, Apellido, Id);
        this.fechaIncorporo = FechaIncorporo;
    }

    public String getFechaIncorporo() {
        return fechaIncorporo;
    }

    public void setFechaIncorporo(String fechaIncorporo) {
        this.fechaIncorporo = fechaIncorporo;
    }

    @Override
    public String toString() {
        return "-La Fecha en la que se incorporo el deocente es: " + fechaIncorporo;
    }

}
