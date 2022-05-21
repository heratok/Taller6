package modelo;

public class profesor extends persona {

    private String Id;

    public profesor(String Id) {
        this.Id = Id;
    }

    public profesor(String Nombre, String Apellido, String Id) {
        super(Nombre, Apellido);
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return " con Id de profesor:" + Id + '}';
    }

}
