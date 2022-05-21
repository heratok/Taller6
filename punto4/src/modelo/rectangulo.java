package modelo;

public class rectangulo extends cuadrilatero {

    public rectangulo() {
    }

    public rectangulo(int coordenadaxA, int cooordenadayA, int coordenadaxB, int coordenadayB, int coordenadaxC, int coordenadayC, int coordenadaxD, int coordenadayD) {
        super(coordenadaxA, cooordenadayA, coordenadaxB, coordenadayB, coordenadaxC, coordenadayC, coordenadaxD, coordenadayD);
    }

    @Override
    public String Area() {
        return super.calcularArea() + "-Rctangulo-";
    }

}
