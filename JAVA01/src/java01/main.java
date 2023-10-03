package java01;
import java.util.*;
import java.util.ArrayList;

public class main {
// ESTE JAVA01 SERIA LA CLASE EMPRESA
    
    public static void main(String[] args) {
        
        // instanciamos 4 objetos de tipo Empleado
        Empleado emple1 = new Empleado("Pepe", 2000);
        Empleado emple2 = new Empleado("Manolo", 300, 2500);
        Empleado emple3 = new Empleado("Lola", 1000);
        Empleado emple4 = new Empleado("Elena", 500, 1500);
        
        // los introducimos en una que creamos lista
        List <Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(emple1);
        empleados.add(emple2);
        empleados.add(emple3);
        empleados.add(emple4);
        
        managmentEmpleados(empleados);
    }
    
    public static void managmentEmpleados(List<Empleado> empleados){
        
        // bandera que indica si salimos o no del menu
        boolean flag = true;
        // iniciamos la opcion elegida, que por defecto es 0
        int opcion = 0;
        // bucle principal
        do{
            // bucle del menu y leemos la opcion del usuario
            do{
                mostrarMenu();
                opcion = Leer.datoInt();

            }while(opcion < 0 || opcion > 6);

            // cuando queremos listar todos los empleados
            if (opcion == 5){
                verTodos(empleados);
            // cuando queremos salir
            }else if(opcion == 6){
                flag = false;
            // cuando son las opciones "normales" entramos a el metodo con switch
            }else{
                //pedimos el empleado
                //Empleado empleado = pedirEmpleado(empleados);
                doChosenOption(opcion, empleados);
            }
        }while(flag != false);
        
    }
    
    public static Empleado pedirEmpleado(List<Empleado> empleados){
        
        // metodo controlado, es decir, no puede superar la cantidad maxima
        int numero = 0;
        int cantidadMax = empleados.size();
        do{
            System.out.print("INTRODUZCA EL NUMERO DEL EMPLEADO QUE QUIERA VER DEL 1 AL "+ cantidadMax +": ");
            numero = Leer.datoInt();
        }while(numero < 0 || numero > cantidadMax);
        
        return empleados.get(numero-1);
    }
    
    public static void mostrarMenu(){
        System.out.println("INTRODUZCA EL NUMERO DE LA OPCION A ELEGIR\n");
        System.out.print("1) Ver sueldo de un empleado.\n");
        System.out.print("2) Ver el nombre de un empleado.\n");
        System.out.print("3) Cambiar el nombre de un empleado.\n");
        System.out.print("4) Establecer el sueldo de un empleado (sin sobrepasar el maximo).\n");
        System.out.print("5) Ver todos los empleados de la empresa.\n");
        System.out.println("6) Salir.\n");
    }
    
    public static void doChosenOption(int opcion, List<Empleado> empleados){
        
        switch(opcion){
            case 1:
                verSueldo(empleados);
                break;
            case 2:
                verNombre(empleados);
                break;
            case 3:
                cambiarNombre(empleados);
                break;
            case 4:
                establecerSueldo(empleados);
                break;
        }
    }
    
    public static void verSueldo(List<Empleado> empleados){
        Empleado empleado = pedirEmpleado(empleados);
        int sueldo = empleado.getSueldo();
        System.out.println("El sueldo es: "+ sueldo+"\n");
    }
    
    public static void verNombre(List<Empleado> empleados){
        Empleado empleado = pedirEmpleado(empleados);
        String nombre = empleado.getNombre();
        System.out.println("El nombre es: "+ nombre+"\n");
    }
    
    public static void cambiarNombre(List<Empleado> empleados){
        Empleado empleado = pedirEmpleado(empleados);
        System.out.println("Introduzca el nuevo nombre: ");
        String nuevoNombre = Leer.dato();
        
        empleados.get(empleados.indexOf(empleado)).setNombre(nuevoNombre);
        System.out.println("El nuevo nombre introducido es: "+ nuevoNombre+"\n");
    }
    
    public static void establecerSueldo(List<Empleado> empleados){
        Empleado empleado = pedirEmpleado(empleados);
        int nuevoSueldo = -1;
        do{
            System.out.println("Introduzca el nuevo sueldo: ");
            nuevoSueldo = Leer.datoInt();
        }while(nuevoSueldo > empleado.getSueldoMaximo() || nuevoSueldo < 0);
        empleados.get(empleados.indexOf(empleado)).setSueldo(nuevoSueldo);
        System.out.println("El nuevo sueldo introducido es: "+ nuevoSueldo);
    }
    
    public static void verTodos(List<Empleado> empleados){
        
        System.out.println("TODOS LOS EMPLEADOS REGISTRADOS.\n");
        //for(int i=0;i<empleados.size();i++){
            
        //}
        
        //for(Empleado eachEmpleado : empleados){
                System.out.println(empleados.toString());
        //}
    }
}
