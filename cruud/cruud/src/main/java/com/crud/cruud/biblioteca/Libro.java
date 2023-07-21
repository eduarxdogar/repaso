package com.crud.cruud.biblioteca;

public class Libro {

    String nombre;
    String nombreAutor;
    int anyo;
    int precio;
    String isbn;


    public  Libro(String nombre,String nombreAutor, int anyo, int precio, String isbn){
        this.nombre= nombre;
        this.nombreAutor= nombreAutor;
        this.anyo= anyo;
        this.precio= precio;
        this.isbn= isbn;
    }

    public String getListLibro(Libro libro){
        return this.nombreAutor;
    }

    public void setNombreAutor() {
        this.nombreAutor = nombreAutor;
    }
}
