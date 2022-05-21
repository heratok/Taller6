package Vista;

import modelo.*;

public class TestHerencia1 {

    public static void main(String[] args) {
        persona profesor1 = new profesor("Braulio", "anania", "Prof 33-739-549");
        System.out.print(profesor1.info());
        System.out.println(profesor1);
    }
}
