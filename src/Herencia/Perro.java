package Herencia;

public class Perro extends Mamifero{
    public Perro(String nombre, String negro){
        super(nombre);
    }

    @Override
    public void comunicarse(){
        System.out.println("Guau!");
    }
    public void traerZapatillas(){
        System.out.println("Aqui tiene las zapatillas, GUAU!");
    }

}
