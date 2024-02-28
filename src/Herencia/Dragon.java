package Herencia;

public class Dragon extends CriaturaMitologica {
    private String nombre;
    private boolean escupe_fuego;
    private boolean vuela;


    public Dragon(String nombre) {
        this.nombre = nombre;
        this.escupe_fuego = true;
        this.vuela = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        if (escupe_fuego && vuela) {
            return this.nombre + " vuela " + " y escupe fuego ";
        }
        return "no es un dragon";
    }
}
