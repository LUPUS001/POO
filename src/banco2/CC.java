package banco2;

import java.util.HashSet;
import java.util.Set;

public class CC {
    private int nCC;
    private int cantidad;
    private Set<Cliente> clientes;

    private Set<Domiciliacion> domiciliaciones;

    public CC(int nCC, int cantidad, Set<Cliente> clientes) {
        this.nCC = nCC;
        this.cantidad = cantidad;
        this.clientes = clientes;
        this.domiciliaciones = new HashSet<>();
    }

    public int getnCC() {
        return nCC;
    }

    public void setnCC(int nCC) {
        this.nCC = nCC;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomicialiacion(Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }
}
