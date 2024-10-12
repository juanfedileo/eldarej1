package org.example;

import java.util.Calendar;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Tarjeta tarjetaVisa = TarjetaFactory.crearTarjeta(TarjetaTipo.VISA, 123456, "John", "Doe", new Date(2025, Calendar.APRIL,9));
        Tarjeta tarjetaAmex = TarjetaFactory.crearTarjeta(TarjetaTipo.AMEX, 159357, "John", "Doe", new Date(2027, Calendar.NOVEMBER,21));
        Tarjeta tarjetaNara = TarjetaFactory.crearTarjeta(TarjetaTipo.NARA, 951753, "John", "Doe", new Date(2021, Calendar.APRIL,28));
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
