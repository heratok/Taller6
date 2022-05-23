package modelo;

public class empleado {

    private int horasTrabajadas;
    private int valorHoras;
    private int Semanas;

    public empleado() {
    }

    public empleado(int horasTrabajadas, int valorHoras, int Semanas) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoras = valorHoras;
        this.Semanas = Semanas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(int valorHoras) {
        this.valorHoras = valorHoras;
    }

    public int getSemanas() {
        return Semanas;
    }

    public void setSemanas(int Semanas) {
        this.Semanas = Semanas;
    }

}
