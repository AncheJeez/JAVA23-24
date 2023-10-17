package Modelo;

import java.util.GregorianCalendar;


public class Empleado {
    
    private int numero;
    private String nombre;
    private String apellido;
    private double saldo;
    private GregorianCalendar fechaAlta;
    
    
    public Empleado(int givenNumber, String givenName, String givenApellido, double givenSaldo){
        this.numero = givenNumber;
        this.nombre = givenName;
        this.apellido = givenApellido;
        this.saldo = givenSaldo;
        this.fechaAlta = new GregorianCalendar();
    }
    
    public Empleado(int givenNumber, String givenName, String givenApellido, double givenSaldo, GregorianCalendar givenFecha){
        this.numero = givenNumber;
        this.nombre = givenName;
        this.apellido = givenApellido;
        this.saldo = givenSaldo;
        this.fechaAlta = givenFecha;
    }
    
    public Empleado(int givenNumber){
        this(givenNumber, null, null,0);
        this.fechaAlta = new GregorianCalendar();
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(GregorianCalendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + ", fechaAlta=" + (fechaAlta).toInstant() + '}';
    }
    
}
