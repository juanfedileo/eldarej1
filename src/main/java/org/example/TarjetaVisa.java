package org.example;

import java.util.Calendar;
import java.util.Date;

public class TarjetaVisa extends Tarjeta{

    public TarjetaVisa(int number, String name, String lastname, Date duedate) {
        super(number, name, lastname, duedate);
    }
    @Override
    public String operacion(int mount) {
        if (!operacionValida(mount)) {
            throw new InvalidOperationException("Importe no valido");
        }
        if (!esValida()) {
            throw new InvalidCardException("Tarjeta vencida");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: Visa ");
        sb.append("Tasa: ");
        Date hoy = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(hoy);
        sb.append(mount * (calendar.get(Calendar.YEAR) % 100) / (calendar.get(Calendar.MONTH) + 1));
        return sb.toString();
    }
}
