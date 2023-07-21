package com.crud.cruud.biblioteca;

public class FacturaImpresion { // se respeta el primero pricipio de responsabilidad unica creando metodos con un solo fin
    private   Factura factura;

    public FacturaImpresion(Factura factura) {
        this.factura = factura;
    }
    public  void imprimeFactura(){

        System.out.println(factura.cantidad + "x" + factura.libro.nombre + "" + factura.libro.precio + "$" );
        System.out.println("tasa de descuento " + factura.tasaDescuento);
        System.out.println("tasa de impuesto " + factura.tasaImpuesto);
        System.out.println("total" + factura.total + "$");
    }
}
