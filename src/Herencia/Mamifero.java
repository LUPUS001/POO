package Herencia;

public class Mamifero extends CriaturaTerricola{
    private String nombre;
    private String tiene_pulmones;
    private String corre;
    private String viviparo;

    public Mamifero(String nombre) {
        this.nombre = nombre;
    }

    public void comunicarse(){
        System.out.println("Mi nombre es: " + this.nombre);
    }
}
