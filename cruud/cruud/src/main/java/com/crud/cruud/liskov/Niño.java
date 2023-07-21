package com.crud.cruud.liskov;

public class Niño extends  Persona{

    private  Adulto tutor;


    public Adulto getTutor() {
        return tutor;
    }

    public void setTutor(Adulto tutor) {
        this.tutor = tutor;
    }

    public Niño(String nombre, String apellidos) {
        super(nombre, apellidos);
        this.tutor=tutor;

    }
}
