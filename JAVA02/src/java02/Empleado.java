package java02;

import java.util.GregorianCalendar;

public class Empleado {
    
    private String nombre;
    
    private String apellido;
        
    private float sueldo;

    private int sueldoMaximo;
    
    private static int numEmpleado;
    
    private GregorianCalendar fechaAlta;
    
    
    private static Empleado primerEmpleado = null;
    
    private static Empleado actualEmpleado = null;
    
    private Empleado siguienteEmpleado;
    
    // empleado siguiente no static
    // empleado inicial static tipo empleado
    // empleado actual static tipo empleado
    
        

    public Empleado(String nombre, String apellido, int sueldoMaximo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMaximo = sueldoMaximo;
        this.sueldo = 0;
        this.numEmpleado++;
        if (primerEmpleado == null)
            primerEmpleado = this;
        else{
            this.siguienteEmpleado = primerEmpleado;
            primerEmpleado = this;
        }
        actualEmpleado = primerEmpleado;
        this.fechaAlta = new GregorianCalendar();
    }

    public Empleado(String nombre, String apellido, float sueldo, int sueldoMaximo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.sueldoMaximo = sueldoMaximo;
        this.numEmpleado++;
        if (primerEmpleado == null)
            primerEmpleado = this;
        else{
            this.siguienteEmpleado = primerEmpleado;
            primerEmpleado = this;
        }
        actualEmpleado = primerEmpleado;
        this.fechaAlta = new GregorianCalendar();
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldoMaximo() {
        return sueldoMaximo;
    }

    public void setSueldoMaximo(int sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }

    public static int getNumEmpleado() {
        return numEmpleado;
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public static Empleado getPrimerEmpleado() {
        return primerEmpleado;
    }

    public static Empleado getActualEmpleado() {
        return actualEmpleado;
    }

    public static void setActualEmpleado(Empleado empleadoActual) {
        Empleado.actualEmpleado = empleadoActual;
    }

    public Empleado getSiguienteEmpleado() {
        return siguienteEmpleado;
    }

    public void setSiguienteEmpleado(Empleado siguienteEmpleado) {
        this.siguienteEmpleado = siguienteEmpleado;
    }
    
    
    public static void avanzar(){
        actualEmpleado = actualEmpleado.siguienteEmpleado;
    }
    
    
    public static void retroceder(){
        
        Empleado aux = primerEmpleado;
        
        while(aux.siguienteEmpleado != actualEmpleado){
            aux = aux.siguienteEmpleado;
        }
        actualEmpleado = aux;
        
    }
    
    // iba a utilizar estas funciones, pero al final he usado un contador atomico
    public static boolean esUltimo(){
        if(actualEmpleado == null){
            return true;
        }else
            return false;
    }
    
    public static boolean esPrimero(){
        if(actualEmpleado == inicialEmpleado)
            return true;
        else
            return false;
    }
    

    public String toString(){
        return "DATOS DEL EMPLEADO:" + getNombre() + "" + getApellido() + " "+ getSueldo() + " " + getSueldoMaximo()+ "\n";
    }
    
    
//    public String toString(){
//        return "DATOS DEL EMPLEADO:" + getNombre() + "" + getApellido() + " "+ getSueldo() + " " + getSueldoMaximo()+ " "+ getFechaAlta()+"\n";
//    }
}
