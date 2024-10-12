package org.example;

import java.util.Date;

public abstract class Tarjeta {
    private int number;
    private String name;
    private String lastname;
    private Date duedate;

    public Tarjeta(int number, String name, String lastname, Date duedate) {
        this.number = number;
        this.name = name;
        this.lastname = lastname;
        this.duedate = duedate;
    }
    public boolean esValida() {
        Date hoy = new Date();
        return duedate.after(hoy);
    }

    public boolean operacionValida(int mount){
        return mount <= 1000 && mount>0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj== null || getClass() != obj.getClass()){
            return false;
        }
        Tarjeta tarjeta = (Tarjeta) obj;
        return number == tarjeta.number;
    }

    public abstract String operacion(int monto);

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setMame(String nombre) {
        this.name = nombre;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    @Override
    public String toString() {
        return "org.example.Tarjeta{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", duedate=" + duedate +
                '}';
    }
}
