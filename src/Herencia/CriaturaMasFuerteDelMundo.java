package Herencia;

import Herencia.CriaturaTerricola;

public class CriaturaMasFuerteDelMundo extends CriaturaTerricola {
    private String name;
    private int PR;
    public CriaturaMasFuerteDelMundo() {
        this.name = "Yujiro Hanma";
        this.PR =Integer.MAX_VALUE;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.name + "\nFuerza bruta en kilos: " + this.PR + " kg";
    }
}
