package Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String titulo;
    private int isbn;
    private Set<Ejemplar> ejemplares;
    private Tema tema;
    private Set<Autor> autores;

    public Libro(String titulo, int isbn, Tema tema) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.ejemplares = new HashSet<>();
        this.tema = tema;
        this.autores = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void addEjemplar(Ejemplar ejemplares){
        this.ejemplares.add(ejemplares);
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    //el siguiente setter permitirá añadir un autor a la lista
    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    @Override
    public String toString(){
        return this.titulo;
    }

}
