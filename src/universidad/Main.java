package universidad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Departamento informatica = new Departamento("Informática");
            Profesor victor = new Profesor("Victor", 45, informatica);
            Profesor maite = new Profesor("Maite", 40, informatica);
            informatica.addProfesor(victor);
            informatica.addProfesor(maite);
        System.out.println(informatica);
    /*    for (Profesor profesor:informatica.getProfesores()) {
            System.out.println(profesor);
        }*/

        List<Departamento> dep = new ArrayList<>();
        dep.add(informatica);
        AreaConocimiento acInformatica = new AreaConocimiento("Área de Informática", dep);
        informatica.setAreaConocimiento(acInformatica);
        informatica.setAreaConocimiento(acInformatica);
        Departamento ciencias = new Departamento("Ciencias");
            Profesor albert = new Profesor("Albert", 50, ciencias);
            Profesor nikola = new Profesor("Nikola", 73, ciencias);
            Profesor oppenheimer = new Profesor("Robert", 25, ciencias);


        AreaConocimiento acCiencias= new AreaConocimiento("Área de Ciencias");
        acCiencias.addDepartamento(ciencias);
        ciencias.setAreaConocimiento(acCiencias);

        System.out.println(acInformatica);
        for (Departamento departamento: acInformatica.getDepartamentos()) {
            for (Profesor profesor:departamento.getProfesores()) {
                System.out.println("\t\ts" + profesor);
            }
        }
    }
}






























