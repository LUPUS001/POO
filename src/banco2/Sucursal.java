package banco2;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int nSuc;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos; //este Set hace una lista, no es lo mismo que el de get/set
    private Set<CC> CCs;

    public Sucursal(int nSuc, String direccion, Banco banco, Set<Prestamo> prestamos) {
        this.nSuc = nSuc;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = prestamos;
        this.CCs = new HashSet<>(); //al poner "new HashSet<>()" no hace falta ponerlo ahora (en la línea 13 de public Sucursal)
    }

    public int getnSuc() {
        return nSuc;
    }

    public void setnSuc(int nSuc) {
        this.nSuc = nSuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public Set<CC> getCCs() {
        return CCs;
    }

    public void setCCs(Set<CC> CCs) {
        this.CCs = CCs;
    }

    public void addCC(CC cc){
        this.CCs.add(cc);
    }

    @Override
    public String toString(){
        return this.nSuc + " - " + this.direccion;
    }
}
