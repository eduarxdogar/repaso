package com.crud.cruud.liskov;

public class Principal {
    public static void main(String[] args) {
        Adulto adulto = new Adulto("123441","cristian","garzon","23444433");
        Adulto adulto1 = new Adulto("234555","pepe","armando","420");
        Niño niño = new Niño("juan","garzon");

        niño.getTutor().pagar();

    }
}
