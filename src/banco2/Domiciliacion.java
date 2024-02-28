package banco2;

public class Domiciliacion {
    private int nDom;
    private String companyia;
    private int cuantia;

    private CC cc;
    public Domiciliacion(int nDom, String companyia, int cuantia, CC cc) {
        this.nDom = nDom;
        this.companyia = companyia;
        this.cuantia = cuantia;
        this.cc = cc;
    }

    public int getnDom() {
        return nDom;
    }

    public void setnDom(int nDom) {
        this.nDom = nDom;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public int getCuantia() {
        return cuantia;
    }

    public void setCuantia(int cuantia) {
        this.cuantia = cuantia;
    }

    public CC getCc() {
        return cc;
    }

    public void setCc(CC cc) {
        this.cc = cc;
    }

    @Override
    public String toString(){
        return this.companyia + " - " + this.cuantia;
    }
}
