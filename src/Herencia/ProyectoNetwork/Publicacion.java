package Herencia.ProyectoNetwork;

import java.util.Date;

public abstract class Publicacion {
    private int ID;
    private Usuario usuario;
    private Date fechaPub;
    private int likes;


    public Publicacion(int ID, Usuario usuario) {
        this.ID = ID;
        this.usuario = usuario;
        this.fechaPub = new Date();
        this.likes = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(Date fechaPub) {
        this.fechaPub = fechaPub;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    public void like(){
        this.likes++;
    }
}