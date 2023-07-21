package com.crud.cruud.liskov;

public class Adulto extends  Persona{
    public Adulto(String dni, String nombre, String apellidos, String tarjeta) {
        super( nombre, apellidos);
        this.dni= dni;
        this.tarjeta = tarjeta;
    }
    private String dni;
    private  String tarjeta;


    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    public  void  pagar(){
        System.out.println("mi dni es " + getDni() + "pago con la tarjeta " + tarjeta);
    }
}
