package Herencia;

public class Pinguino extends Ave{
    private String no_vuela;

    public Pinguino(String poneHuevos, String tienePico, String no_vuela) {
        super(null, poneHuevos, tienePico);
        this.no_vuela = no_vuela;
    }

    public String getNo_vuela() {
        return no_vuela;
    }

    public void setNo_vuela(String no_vuela) {
        this.no_vuela = no_vuela;
    }
}
