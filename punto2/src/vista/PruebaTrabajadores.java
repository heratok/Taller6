package vista;
import modelo.*;

public class PruebaTrabajadores {
    public static void main(String[] args) {
        empleado E1=new empleado("Hector");
        directivo D1=new directivo("Luis");
        operario OP=new operario("Temmo");
        oficial OF1=new oficial("Camilo");
        tecnico T1=new tecnico("Pablo");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP);
        System.out.println(OF1);
        System.out.println(T1);
    }
}
