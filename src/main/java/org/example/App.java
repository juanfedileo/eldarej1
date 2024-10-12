package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App
{
    public static void main( String[] args )
    {
        Tarjeta tarjetaVisa = TarjetaFactory.crearTarjeta(TarjetaTipo.VISA, 123456, "John", "Doe", new GregorianCalendar(2025, Calendar.APRIL,9).getTime());
        Tarjeta tarjetaAmex = TarjetaFactory.crearTarjeta(TarjetaTipo.AMEX, 159357, "John", "Doe", new GregorianCalendar(2027, Calendar.NOVEMBER,21).getTime());
        Tarjeta tarjetaNara = TarjetaFactory.crearTarjeta(TarjetaTipo.NARA, 951753, "John", "Doe", new GregorianCalendar(2021, Calendar.APRIL, 28).getTime());
        System.out.println(tarjetaVisa);
        if (tarjetaVisa.operacionValida(5895)){
            System.out.println("Operacion valida");
        }else {
            System.out.println("Operacion no valida");
        }
        if (tarjetaNara.esValida()){
            System.out.println("Tarjeta valida");
        }else {
            System.out.println("Tarjeta no valida");
        }
        if (tarjetaNara.equals(tarjetaVisa)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintas");
        }
        System.out.println(tarjetaVisa.operacion(200));
        System.out.println(tarjetaAmex.operacion(4000));
        System.out.println(tarjetaNara.operacion(-500));
    }
}
