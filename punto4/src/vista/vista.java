package vista;

import modelo.*;

public class vista {

    public static void main(String[] args) {
        cuadrilatero Trapecio1 = new trapecio(11, 5, -1, 5, 8, -6, 9, 1);
        System.out.println(Trapecio1.Area() + "\n-----------------------------");
        cuadrilatero Rectangulo1 = new rectangulo(-2, 4, 1, 6, 11, -3, 8, 2);
        System.out.println(Rectangulo1.Area() + "\n---------------------------");
        cuadrilatero Cuadrado1 = new cuadrado(4, -5, 3, 2, 6, -8, -1, -5);
        System.out.println(Cuadrado1.Area() + "\n----------------------------");
    }

}