package com.crud.cruud.figuras;

public class Test {
    static void getAreaTest(Rectangulo r) {
        int ancho = r.getAncho();
        r.setAlto(10);
        System.out.println("Area esperada de " + (ancho * 10) + ", tiene " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangulo rc = new Rectangulo(2, 3);
        Rectangulo al = new Rectangulo(4,5);
        getAreaTest(rc);
        getAreaTest(al);

        Rectangulo sq = new Cuadrado();
        sq.setAncho(5);
        getAreaTest(sq);
    }
}
