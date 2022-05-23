package vista;

import modelo.*;

public class pruebaEmpleado {

    public static void main(String[] args) {
        empleadoAsalariado empleado1 = new empleadoAsalariado(7, 0, 2, (int) 1);
        empleado1.Salario();
        empleadoHoras empleado2 = new empleadoHoras(5, 700, 6, 0, 1);
        empleado2.calcularSalario();
        empleadoHoras empleado5 = new empleadoHoras(7, 8000, 7, 4, 5);
        empleado5.calcularSalario();
        empleadoComision empleado3 = new empleadoComision(7, 4000, 4, 2, 3, 6, 300000, 5);
        empleado3.SalarioComision();
        empleadoAsalariadoComision empleado4 = new empleadoAsalariadoComision(3, 7000, 1, 3000000, 7, 0, 5, 0, 34);
        empleado4.calcularSalarioPor();
    }
}
