package universidad;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;
    private AreaConocimiento areaConocimiento;
    private List<Catedra> catedras;

    public Departamento(String nombre, List<Profesor> profesores, List<Catedra> catedras) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.catedras = catedras;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.catedras = new ArrayList<>();
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public List<Profesor> getProfesores() {return profesores;}

    public void setProfesores(List<Profesor> profesores) {this.profesores = profesores;}

    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {this.areaConocimiento = areaConocimiento;}

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){return this.nombre;}


}
