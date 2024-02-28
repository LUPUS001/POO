package Herencia.Trabajadores;

public class Main {
    public static void main(String[] args) {
        Directivo d = new Directivo("Jose Maria");
        Oficial o = new Oficial("Mateo");
        Tecnico t = new Tecnico("Tetico");
        System.out.println(d);
        System.out.println(o);
        System.out.println(t);

    }
}
