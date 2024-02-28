package Herencia;

public class Ave extends CriaturaTerricola{
    private String volar;
    private String poneHuevos;
    private String tienePico;

    public Ave(String volar, String poneHuevos, String tienePico) {
        this.volar = volar;
        this.poneHuevos = poneHuevos;
        this.tienePico = tienePico;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public String getPoneHuevos() {
        return poneHuevos;
    }

    public void setPoneHuevos(String poneHuevos) {
        this.poneHuevos = poneHuevos;
    }

    public String getTienePico() {
        return tienePico;
    }

    public void setTienePico(String tienePico) {
        this.tienePico = tienePico;
    }
}
