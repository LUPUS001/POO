package Herencia.Trabajadores;

public class Empleado {
    private String nombre;
    //Mi versión -> protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return this.nombre;
//Mi versión ->   return "Empleado: " + nombre;
    }
}
