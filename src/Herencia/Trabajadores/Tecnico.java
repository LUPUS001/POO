package Herencia.Trabajadores;

public class Tecnico extends Operario{
    Tecnico (String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return "Tecnico: " + this.getNombre();
    }
}
