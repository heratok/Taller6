package modelo;

public class empleadoHoras extends empleadoAsalariado {

    private int horasExtra;

    public empleadoHoras(int horasExtra, double salarioFijo, int horasTrabajadas, int valorHoras, int Semanas) {
        super(salarioFijo, horasTrabajadas, valorHoras, Semanas);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void calcularSalario() {
        int calculosemanal = getSemanas() * 6;
        int operacion = getHorasTrabajadas() * calculosemanal;

        if (operacion > 40) {
            double operacion1 = (getHorasTrabajadas() + getHorasExtra()) * getValorHoras();
            System.out.println("-El empleado trabajo mas de 40 horas por lo tanto recibe un sueldo por sus horas extras de: " + operacion);
        } else {
            double operacion2 = getHorasTrabajadas() * getValorHoras();
            System.out.println("-El empleado trabajo menos de 40 horas por lo tanto recibe un sueldo de: " + operacion2);
        }
    }

}
