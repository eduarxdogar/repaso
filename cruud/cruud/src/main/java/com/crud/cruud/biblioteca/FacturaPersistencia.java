package com.crud.cruud.biblioteca;


public class FacturaPersistencia {// principio de abierto y cerrado abierto a extenciones y cerradoa modificacines  aca no respeta este principio por ende se creo la interfaz y otra clase donde se va implementar el metodo de la interfaz
    Factura factura;

    public FacturaPersistencia(Factura factura) {
        this.factura = factura;
    }
    public void guardarArchivo(String nombreArchivo) {
        // Crea un archivo con el nombre dado y escribe la factura.
    }
    public void guardarEnBaseDatos() {
        // Guarda la factura en la base de datos
    }


    /*
    public String guardarArchivo(String nombreArchivo){
        if (nombreArchivo != null){


        }else  {
            this.factura.setCantidad(factura.getCantidad());
        }
        return  factura.guardarArchivo();
*/
    }




