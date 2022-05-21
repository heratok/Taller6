package modelo;

public abstract class cuadrilatero {

    private int coordenadaxA;
    private int cooordenadayA;
    private int coordenadaxB;
    private int coordenadayB;
    private int coordenadaxC;
    private int coordenadayC;
    private int coordenadaxD;
    private int coordenadayD;

    public cuadrilatero() {

    }

    public cuadrilatero(int coordenadaxA, int cooordenadayA, int coordenadaxB, int coordenadayB, int coordenadaxC, int coordenadayC, int coordenadaxD, int coordenadayD) {
        this.coordenadaxA = coordenadaxA;
        this.cooordenadayA = cooordenadayA;
        this.coordenadaxB = coordenadaxB;
        this.coordenadayB = coordenadayB;
        this.coordenadaxC = coordenadaxC;
        this.coordenadayC = coordenadayC;
        this.coordenadaxD = coordenadaxD;
        this.coordenadayD = coordenadayD;
    }

    public int getCoordenadaxA() {
        return coordenadaxA;
    }

    public void setCoordenadaxA(int coordenadaxA) {
        this.coordenadaxA = coordenadaxA;
    }

    public int getCooordenadayA() {
        return cooordenadayA;
    }

    public void setCooordenadayA(int cooordenadayA) {
        this.cooordenadayA = cooordenadayA;
    }

    public int getCoordenadaxB() {
        return coordenadaxB;
    }

    public void setCoordenadaxB(int coordenadaxB) {
        this.coordenadaxB = coordenadaxB;
    }

    public int getCoordenadayB() {
        return coordenadayB;
    }

    public void setCoordenadayB(int coordenadayB) {
        this.coordenadayB = coordenadayB;
    }

    public int getCoordenadaxC() {
        return coordenadaxC;
    }

    public void setCoordenadaxC(int coordenadaxC) {
        this.coordenadaxC = coordenadaxC;
    }

    public int getCoordenadayC() {
        return coordenadayC;
    }

    public void setCoordenadayC(int coordenadayC) {
        this.coordenadayC = coordenadayC;
    }

    public int getCoordenadaxD() {
        return coordenadaxD;
    }

    public void setCoordenadaxD(int coordenadaxD) {
        this.coordenadaxD = coordenadaxD;
    }

    public int getCoordenadayD() {
        return coordenadayD;
    }

    public void setCoordenadayD(int coordenadayD) {
        this.coordenadayD = coordenadayD;
    }

    public String calcularArea() {
        System.out.println("-Esta es el area de la figura:");
        float a;
        a = (this.coordenadaxA * this.coordenadayD) + (this.coordenadaxD * this.coordenadayC) + (this.coordenadaxC * this.coordenadayB) + (this.coordenadaxB * this.cooordenadayA)
                - (this.coordenadaxA * this.coordenadayB) - (this.coordenadaxB * this.coordenadayC) - (this.coordenadaxC * this.coordenadayD) - (this.coordenadaxD * this.cooordenadayA);
        if (a < 0) {
            return a / 2 * (-1) + " -Unidades Cuadradas-";
        } else if (a > 0) {
            return a / 2 + " -Unidades Cuadradas-";
        }
        return null;
    }

    public abstract String Area();
}
