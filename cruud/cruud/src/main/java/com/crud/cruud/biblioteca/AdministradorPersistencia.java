package com.crud.cruud.biblioteca;

public class AdministradorPersistencia {//Ahora podemos pasar cualquier clase que implemente la interfaz FacturaPersistencia a esta clase con la ayuda del polimorfismo. Esta es la flexibilidad que proporcionan las interfaces.

    FacturaPersistencia facturaPersistencia;
    LibroPersistencia libroPersistencia;

    public AdministradorPersistencia(FacturaPersistencia facturaPersistencia, LibroPersistencia libroPersistencia) {
        this.facturaPersistencia = facturaPersistencia;
        this.libroPersistencia = libroPersistencia;
    }
}
