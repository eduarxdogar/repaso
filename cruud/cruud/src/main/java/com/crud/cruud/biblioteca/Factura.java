package com.crud.cruud.biblioteca;

public class Factura {// ejemplo que esta clase no respeta el principio de resposabilidad unica por el uso de sus metodos

    public static void main(String[] args) {

    }

    Libro libro;


    int cantidad;
    double tasaDescuento;
    double tasaImpuesto;
    double total;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.tasaDescuento = tasaDescuento;
        this.tasaImpuesto = tasaImpuesto;
        this.total = this.calculTotal();
    }

    public double calculTotal() {
        double precio = ((libro.precio - libro.precio * tasaDescuento * this.cantidad));


        double precioConImpuestos = precio * (1 + tasaImpuesto);
        return precioConImpuestos;
    }

    public String guardarArchivo(){
        return guardarArchivo();
    }
 /*

 public  void imprimeFactura(){

     System.out.println(cantidad + "x" + libro.nombre + "" );
     System.out.println("tasa de descuento " + tasaDescuento);
     System.out.println("tasa de impuesto " + tasaImpuesto);
     System.out.println("total" + total);
 }
*/
}

