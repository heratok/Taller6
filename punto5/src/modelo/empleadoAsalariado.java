package modelo;

public class empleadoAsalariado extends empleado {

    private double salarioFijo;

    public empleadoAsalariado(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public empleadoAsalariado(double salarioFijo, int horasTrabajadas, int valorHoras, int Semanas) {
        super(horasTrabajadas, valorHoras, Semanas);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public void Salario() {
        System.out.printf("-El empleado asalariado trabajo " + getHorasTrabajadas() + " horas en  un " + getSemanas() + " semanas y recibira un salario de %f", getSalarioFijo());
        System.out.printf("\n");
    }

}
