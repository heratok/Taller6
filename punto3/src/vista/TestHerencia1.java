package Vista;

import modelo.*;

public class TestHerencia1 {

    public static void main(String[] args) {
        persona profesor1 = new profesor("Jairo", "Sejuanes", "Prof 34-789-109");
        System.out.print(profesor1.info());
        System.out.println(profesor1);
    }
}
