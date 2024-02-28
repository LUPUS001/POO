package banco2;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva = new Banco(222,"BBVA", new HashSet<Sucursal>());
            Sucursal mayor = new Sucursal(111,"C/Mayor", bbva, new HashSet<>());
            bbva.addSucursal(mayor);
                Cliente maria = new Cliente(1,"María", new HashSet<>());
                Prestamo p1 = new Prestamo(1, 1000, mayor, maria);
                mayor.addPrestamo(p1);

                CC ccMaria = new CC(1, 1000, new HashSet<>());
                ccMaria.addCliente(maria);
                maria.addCC(ccMaria);
                mayor.addCC(ccMaria);

                Domiciliacion dom = new Domiciliacion(110, "Iberdrola", 100, ccMaria);
                ccMaria.addDomicialiacion(dom);

            Sucursal enMedio = new Sucursal(123, "C/ EnMedio", bbva, new HashSet<>());
                Cliente juan = new Cliente(2,"Juan", new HashSet<>());
                Prestamo p2 = new Prestamo(2,5000,enMedio, juan);
                Prestamo p3 = new Prestamo(3,3000,enMedio, juan);
                    enMedio.addPrestamo(p2);
                    enMedio.addPrestamo(p3);

            bbva.addSucursal(enMedio);

        System.out.println(bbva);
        for (Sucursal s: bbva.getSucursales()) {
            System.out.println("\t" + s);
            for (Prestamo p : s.getPrestamos()){
                System.out.println("\t\t" + p);
                System.out.println(" " + p.getCliente());
            }
        }

    }

}
