package java01;

/**
 *
 * @author alumno
 */
public class Empleado {
    
    String nombre;
        
    int sueldo;

    int sueldoMaximo;

    public Empleado(String nombre, int sueldoMaximo) {
        this.nombre = nombre;
        this.sueldoMaximo = sueldoMaximo;
        this.sueldo = 0; 
    }

    public Empleado(String nombre, int sueldo, int sueldoMaximo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldoMaximo = sueldoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldoMaximo() {
        return sueldoMaximo;
    }

    public void setSueldoMaximo(int sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }

    public String toString(){
        return "DATOS DEL EMPLEADO:" + getNombre() + " "+ getSueldo() + " " + getSueldoMaximo()+"\n";
    }
}
