package modelo;

public class profesorInterno extends profesor {

    private String FechaIncorporo;

    public profesorInterno(String FechaIncorporo, String Id) {
        super(Id);
        this.FechaIncorporo = FechaIncorporo;
    }

    public profesorInterno(String Nombre, String Apellido, String Id, String FechaIncorporo) {
        super(Nombre, Apellido, Id);
        this.FechaIncorporo = FechaIncorporo;
    }

    public String getFecha_Incorporo() {
        return FechaIncorporo;
    }

    public void setFecha_Incorporo(String FechaIncorporo) {
        this.FechaIncorporo = FechaIncorporo;
    }

    @Override
    public String toString() {
        return "Fecha en la que se incorporo:" + FechaIncorporo;
    }

}
