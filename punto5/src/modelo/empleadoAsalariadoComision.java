package modelo;

public class empleadoAsalariadoComision extends empleadoComision {

    private double PorAgregadoComi; //porcentaje de comision

    public empleadoAsalariadoComision(double PorAgregadoComi, int ventasHechas, int valorArticulo, double porVenta, int horasExtra, double salarioFijo, int horasTrabajadas, int valorHoras, int Semanas) {
        super(ventasHechas, valorArticulo, porVenta, horasExtra, salarioFijo, horasTrabajadas, valorHoras, Semanas);
        this.PorAgregadoComi = PorAgregadoComi;
    }

    public double getPorAgregadoComi() {
        return PorAgregadoComi;
    }

    public void setPorAgregadoComi(double PorAgregadoComi) {
        this.PorAgregadoComi = PorAgregadoComi;
    }

    public void calcularSalarioPor() {  //calcular salario con el porcentaje
        double porcent = getPorAgregadoComi() / 100;
        int calculoSemana = getSemanas() * 6;
        int calcular = getHorasTrabajadas() * calculoSemana;
        double sueldo = ((getSalarioFijo() * porcent) + getSalarioFijo());
        System.out.printf("-El empleado asalariado por comision, tiene un salario fijo: %f", getSalarioFijo());
        System.out.println(" y trabajo " + calcular);
        System.out.printf("horas pero tiene un 10 porciento  agregado a su salario incial entonces su salario sera de: %f", sueldo);
        System.out.printf("\n");
    }
}
