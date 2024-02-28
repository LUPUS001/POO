package Ejercicio7;

import java.util.Set;

public class Lector {
    private String dni;
    private Set<Ejemplar> ejemplares;

    public Lector(String dni, Set<Ejemplar> ejemplares) {
        this.dni = dni;
        this.ejemplares = ejemplares;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }
}
