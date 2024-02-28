package Herencia.Trabajadores;

public class Operario extends Empleado{
    Operario(String nombre){
        super(nombre);
    }
    @Override
    public String toString(){
        return "Operario: " + this.getNombre();
    }
}
