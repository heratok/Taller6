package vista;

import modelo.*;

public class vista {

    public static void main(String[] args) {
        cuadrilatero Trapecio = new trapecio(10, 2, -1, 4, 8, -6, 5, 1);
        System.out.println(Trapecio.Area() + "\n-----------------------------");
        cuadrilatero Rectangulo = new rectangulo(-7, 1, 1, 6, 10, -3, 6, 2);
        System.out.println(Rectangulo.Area() + "\n---------------------------");
        cuadrilatero Cuadrado = new cuadrado(2, -5, 3, 1, 2, -9, -1, -4);
        System.out.println(Rectangulo.Area() + "\n----------------------------");
    }

}