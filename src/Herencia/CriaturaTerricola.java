package Herencia;

public abstract class CriaturaTerricola extends Criatura {
    private String bebe_agua;
    private String come;
    private String respira;

    public String getBebe_agua() {
        return bebe_agua;
    }

    public void setBebe_agua(String bebe_agua) {
        this.bebe_agua = bebe_agua;
    }

    public String getCome() {
        return come;
    }

    public void setCome(String come) {
        this.come = come;
    }

    public String getRespira() {
        return respira;
    }

    public void setRespira(String respira) {
        this.respira = respira;
    }
}
