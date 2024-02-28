package universidad;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Catedra> catedras;

    public Facultad(String nombre, List<Catedra> catedras) {
        this.nombre = nombre;
        this.catedras = catedras;
    }

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
