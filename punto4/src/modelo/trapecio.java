package modelo;

public class trapecio extends cuadrilatero {

    public trapecio() {
    }

    public trapecio(int coordenadaxA, int cooordenadayA, int coordenadaxB, int coordenadayB, int coordenadaxC, int coordenadayC, int coordenadaxD, int coordenadayD) {
        super(coordenadaxA, cooordenadayA, coordenadaxB, coordenadayB, coordenadaxC, coordenadayC, coordenadaxD, coordenadayD);
    }

    @Override
    public String Area() {
        return super.calcularArea() + "-Trapecio-";
    }

}
