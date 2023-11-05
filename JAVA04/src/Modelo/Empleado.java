package Modelo;

import java.io.Serializable;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;

public abstract class Empleado implements Fecha, Serializable{
    
    protected static final long serialVersionUID = 1L;
    
    protected int numero;
    protected transient String nombre;
    protected transient String apellido;
    protected double saldo;
    protected double saldoMax;
    protected GregorianCalendar fechaAlta;
    
    // fecha dia de hoy
    public Empleado(int givenNumber, String givenName, String givenApellido, double givenSaldo, double givenSaldoMax){
        this.numero = givenNumber;
        this.nombre = givenName;
        this.apellido = givenApellido;
        this.saldo = givenSaldo;
        // creamos una excepcion para cuando el saldo max introducimo es menor al saldo.
        try{
            if(givenSaldo <= givenSaldoMax){
                this.saldoMax = givenSaldoMax;
            }else{
                // establecemos en este caso que el saldo maximo sera el saldo introducido mas 250
                this.saldoMax = givenSaldoMax - 250;
                throw new CustomException("SaldoMaximo introducido es menor al saldo dado en el empleado nº"+getNumero());
            }
        }catch(CustomException excep){
            System.out.println(excep.getMessage());
        }
        this.fechaAlta = new GregorianCalendar();
    }
    
    // se le pasa la fecha
    public Empleado(int givenNumber, String givenName, String givenApellido, double givenSaldo, double givenSaldoMax,GregorianCalendar givenFecha){
        this.numero = givenNumber;
        this.nombre = givenName;
        this.apellido = givenApellido;
        this.saldo = givenSaldo;
        // creamos una excepcion para cuando el saldo max introducimo es menor al saldo.
        try{
            if(givenSaldo <= givenSaldoMax){
                this.saldoMax = givenSaldoMax;
            }else{
                // establecemos en este caso que el saldo maximo sera el saldo introducido mas 250
                this.saldoMax = givenSaldo + 250;
                throw new CustomException("SaldoMaximo introducido es menor al saldo dado en el empleado nº"+getNumero());
            }
        }catch(CustomException excep){
            System.out.println(excep.getMessage());
        }
        this.fechaAlta = givenFecha;
    }
    
    public Empleado(int givenNumber){
        this(givenNumber, null, null,0,0);
        this.fechaAlta = new GregorianCalendar();
    }
    
    // metodo para saber la cantidad en meses entre la fecha de alta y la actual
    public int getNumMonthsSince(){
        GregorianCalendar diaHoy = Fecha.diaHoy;
        int mesActual = diaHoy.get(MES);
        int anioActual = diaHoy.get(ANIO);
        
        int mesAlta = (getFechaAlta()).get(MONTH);
        int anioAlta = (getFechaAlta()).get(YEAR);
        
        // los meses enpiezan en 0 y acaban en 11
        int total = (12*(anioActual-anioAlta))-(mesAlta+1)+(mesActual+1);
        return total;
    }
    
    public String getNumMonthsSinceToString(){
        int total = getNumMonthsSince();
        return "Han pasado "+total/12+" años y "+total%12+" meses.";
    }
    
    public boolean compare(Empleado other){
        if(this.nombre.compareTo(other.nombre) == 0)
            return true;
        else
            return false;
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

    public double getSaldoMax() {
        return saldoMax;
    }

    public void setSaldoMax(double saldoMax) {
        this.saldoMax = saldoMax;
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(GregorianCalendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public String getFechaAltaString(){
        return (getFechaAlta()).get(DAY_OF_MONTH)+"/"+((getFechaAlta()).get(MONTH)+1)+"/"+(getFechaAlta()).get(YEAR);
    }

    public String empleadoToString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + ", saldoMax="+saldoMax+", fechaAlta="+ getFechaAltaString() + '}';
    }
    
}
