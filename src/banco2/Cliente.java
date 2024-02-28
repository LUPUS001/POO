package banco2;

import java.util.Set;

public class Cliente {
    private int nCli;
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<CC> CCs;

    public Cliente(int nCli, String nombre, Set<Prestamo> prestamos) {
        this.nCli = nCli;
        this.nombre = nombre;
        this.prestamos = prestamos;
    }

    public int getnCli() {
        return nCli;
    }

    public void setnCli(int nCli) {
        this.nCli = nCli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nCli=" + nCli +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public Set<CC> getCCs() {
        return CCs;
    }

    public void addCC(CC cc){
        this.CCs.add(cc);
    }
    public void setCCs(Set<CC> CCs) {
        this.CCs = CCs;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
