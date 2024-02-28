public class Person { //como esta clase solo tiene dos campos/atributos(name y address)...
    private String name;  //le pondremos el modificador "private" para no se pueda acceder a ellas desde fuera de la clase (public class Person, en este caso)
    private String address;

    public Person(String name){
        this.name = name;
    }
}

