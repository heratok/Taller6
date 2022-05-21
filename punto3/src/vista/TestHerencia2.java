package Vista;

import modelo.*;


public class TestHerencia2 {
    public static void main(String[] args) {
        profesor profesorInterino = new profesorInterno("Camilo", "Torrez ", "321-432-422", "Viernes Maz 11 1:35:32 cet 2022");
        System.out.print(profesorInterino.info());
        System.out.println(profesorInterino);
        
    }
}

