package org.example;

import java.util.Calendar;
import java.util.Date;

public class TarjetaAmex extends Tarjeta{
    public TarjetaAmex(int number, String name, String lastname, Date duedate) {
        super(number, name, lastname, duedate);
    }

    @Override
    public String operacion(int mount) {
        if (operacionValida(mount)){
            StringBuilder sb = new StringBuilder();
            sb.append("Marca: Amex ");
            sb.append("Tasa: ");
            Date hoy = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(hoy);
            sb.append(mount*(calendar.get(Calendar.MONTH)+1)*0.1);
            return sb.toString();
        }
        return "Monto invalido";
    }
}
