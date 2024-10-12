package org.example;

import java.util.Calendar;
import java.util.Date;

public class TarjetaNara extends Tarjeta{

    public TarjetaNara(int number, String name, String lastname, Date duedate) {
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
        sb.append("Marca: Nara ");
        sb.append("Tasa: ");
        Date hoy = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(hoy);
        sb.append(mount*calendar.get(Calendar.DAY_OF_MONTH)*0.5);
        return sb.toString();
    }
}
