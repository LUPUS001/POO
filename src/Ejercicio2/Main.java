package Ejercicio2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boton;
        AireAcondicionado aire = new AireAcondicionado("Triksol9000", 20, 30, 10);
        do {
            System.out.println(aire);
            boton = scanner.nextLine();
            switch (boton){
                case "+":
                    aire.subir();
                    break;
                case "-":
                    aire.subir();
                    break;
            }
            if(boton.equals("Exit")) break;
        } while (true);
    }

}



