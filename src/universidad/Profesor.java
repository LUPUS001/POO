package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private String nombre;
    private int edad;
    private Departamento departamento;
    private Set<Adscrito> adscritos;

    public Profesor(String nombre, int edad, Departamento departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.adscritos = new HashSet<>();
    }

    public Profesor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.adscritos = new HashSet<>();
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Adscrito> getAdscritos() {
        return adscritos;
    }

    public void setAdscritos(Set<Adscrito> adscritos) {
        this.adscritos = adscritos;
    }

    public void addAdscrito(Adscrito adscrito){
        this.adscritos.add(adscrito);
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.edad + " - " + this.departamento;
    }
}
