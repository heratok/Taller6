package modelo;

public class empleadoComision extends empleadoHoras {

    private int ventasHechas;
    private int valorArticulo;
    private double porVenta; //porcentaje venta

    public empleadoComision(int ventasHechas, int valorArticulo, double porVenta, int horasExtra, double salarioFijo, int horasTrabajadas, int valorHoras, int Semanas) {
        super(horasExtra, salarioFijo, horasTrabajadas, valorHoras, Semanas);
        this.ventasHechas = ventasHechas;
        this.valorArticulo = valorArticulo;
        this.porVenta = porVenta;
    }

    public int getVentasHechas() {
        return ventasHechas;
    }

    public void setVentasHechas(int ventasHechas) {
        this.ventasHechas = ventasHechas;
    }

    public int getValorArticulo() {
        return valorArticulo;
    }

    public void setValorArticulo(int valorArticulo) {
        this.valorArticulo = valorArticulo;
    }

    public double getPorVenta() {
        return porVenta;
    }

    public void setPorVenta(double porVenta) {
        this.porVenta = porVenta;
    }

    public void SalarioComision() {
        double porcentaje = getPorVenta() / 100;
        int operacion3 = (int) ((getHorasTrabajadas() * getValorHoras()) + ((getVentasHechas() * getValorArticulo()) * (porcentaje)));
        System.out.println("-El empleado por comision que ha hecho " + getVentasHechas()
                + " ventas, y los articulos tienen un valor de " + getValorArticulo() + " y tiene un pocentaje de venta " + porcentaje
                + " por lo tanto su salario sera de: " + operacion3);
    }

}
