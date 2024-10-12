package org.example;

import java.util.Date;

public class TarjetaFactory {

    public static Tarjeta crearTarjeta(TarjetaTipo tipo, int number, String name, String lastname, Date duedate) {
        if (name == null || lastname == null) {
            throw new IllegalArgumentException("Nombre o apellido no pueden ser nulos");
        }

        switch (tipo) {
            case VISA:
                return new TarjetaVisa(number, name, lastname, duedate);
            case NARA:
                return new TarjetaNara(number, name, lastname, duedate);
            case AMEX:
                return new TarjetaAmex(number, name, lastname, duedate);
            default:
                throw new IllegalArgumentException("Tipo de tarjeta no soportado");
        }
    }
}
