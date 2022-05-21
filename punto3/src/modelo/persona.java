package modelo;

public class persona {

    private String Nombre;
    private String Apellido;

    public persona() {
    }

    public persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String info() {
        return "Nombre de profesor: " + Nombre + " " + Apellido;
    }

}
