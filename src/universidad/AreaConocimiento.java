package universidad;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private String nombre;
    private List<Departamento> departamentos;

    public AreaConocimiento(String nombre, List<Departamento> departamentoList) {
        this.nombre = nombre;
        this.departamentos = departamentoList;
    }

    public AreaConocimiento(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}

