package Ejercicio1;

import java.util.ArrayList;

public class MainOrdenadores {
    public static void main(String[] args) {
        Ordenador alejandro = new Ordenador("22300", "Huawei", 1500);
        Ordenador antonio = new Ordenador("06236", "Asus", 2300);
        ArrayList<Ordenador> listaOrdenador = new ArrayList<>();
        listaOrdenador.add(alejandro);
        listaOrdenador.add(antonio);
        listaOrdenador.forEach(System.out::println);
    }
}
