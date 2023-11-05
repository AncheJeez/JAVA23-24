    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MyList;
import Modelo.Analista;
import Modelo.CustomException;
import Modelo.Empleado;
import Modelo.Programador;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class mainTerminal {
    
    public static void main(String[] args){
        
        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println("*********** TESTING PROGRAMADORES ***********");
        
        GregorianCalendar gcr1 = getRandomLogicalDate();
        Programador pro1 = new Programador(1,"Andres","Sanchez",2100,6000, gc,30,"Java");
        Programador pro2 = new Programador(2, "Angel", "Gonzalez",1350, 8000, setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),25,"C#");
        Programador pro3 = new Programador(3,"Sandra","Naranjo",1500,4500, gcr1,60,"Python");
        Programador pro4 = new Programador(4,"Ale","Benitez",2000,2100,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),250,"Rust");
        try{
            System.out.println("Test check cumple mes alta dia de hoy: ");
            pro1.checkCumpleMesAnio();
            System.out.println("Test check cumple mes valido (misma fecha, un año anterior se dio de alta)");
            pro2.checkCumpleMesAnio();
            System.out.println("Test check cumple mes aleatorio");
            pro3.checkCumpleMesAnio();
            System.out.println("No valido, superraria el saldo Max");
            pro4.checkCumpleMesAnio();
        }catch(CustomException excep){
            System.out.println(excep.getMessage());
        }
        
        System.out.println("*********** TESTING ANALISTAS ***********");
        
        GregorianCalendar gcr2 = getRandomLogicalDate();
        Analista an1 = new Analista(5,"Pepe","Lopez",2100,6000, gc,2,8);
        Analista an2 = new Analista(6, "Maria", "Vazquez",1350, 8000, setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),5,22);
        Analista an3 = new Analista(7,"Francisco","Gomez",1500,4500, gcr2,8,3);
        Analista an4 = new Analista(8,"Lola","Fernandez",2000,2100,setDate(gc.get(GregorianCalendar.DAY_OF_MONTH),gc.get(GregorianCalendar.MONTH),(gc.get(GregorianCalendar.YEAR)-1)),30,4);
        try{
            System.out.println("Test check cumple año alta dia de hoy: ");
            an1.checkCumpleMesAnio();
            System.out.println("Test check cumple año valido (misma fecha, un año anterior se dio de alta)");
            an2.checkCumpleMesAnio();
            System.out.println("Test check cumple año aleatorio");
            an3.checkCumpleMesAnio();
            System.out.println("No valido, superraria el saldo Max");
            an4.checkCumpleMesAnio();
        }catch(CustomException excep){
            System.out.println(excep.getMessage());
        }
        
        System.out.println("*********** TESTING METHODS ***********");
        
        MyList listaEmpleados = new MyList();
        listaEmpleados.add(pro1);
        listaEmpleados.getPointerLast().setIndice(0);
        listaEmpleados.add(pro2);
        listaEmpleados.getPointerLast().setIndice(1);
        listaEmpleados.add(pro3);
        listaEmpleados.getPointerLast().setIndice(2);
        listaEmpleados.add(pro4);
        listaEmpleados.getPointerLast().setIndice(3);
        listaEmpleados.add(an1);
        listaEmpleados.getPointerLast().setIndice(4);
        listaEmpleados.add(an2);
        listaEmpleados.getPointerLast().setIndice(5);
        listaEmpleados.add(an3);
        listaEmpleados.getPointerLast().setIndice(6);
        listaEmpleados.add(an4);
        listaEmpleados.getPointerLast().setIndice(7);
        
        listaEmpleados.showMyList();

        listaEmpleados.intercambiarMain(0, 7);
        listaEmpleados.intercambiarMain(2, 5);
        listaEmpleados.intercambiarMain(4, 3);
        listaEmpleados.intercambiarMain(6, 1);

        listaEmpleados.showMyList();
        
        System.out.println("\nSORTING LIST");
        listaEmpleados.sort();
        
        listaEmpleados.showMyList();
        
//        listaEmpleados.serialization("MyListSerializated","");
//        
//        
//        MyList nuevaLista = new MyList();
//        List<Empleado> lista = nuevaLista.deserialization("");
//        for(int i=0;i<lista.size();i++){
//            nuevaLista.add(lista.get(i));
//            nuevaLista.getPointerLast().setIndice(lista.get(i).getNumero()-1);
//        }
//        
//        System.out.println("LISTA DESEARIALIZADA:");
//        nuevaLista.showMyList();
    }
    
    public static GregorianCalendar getRandomLogicalDate(){
        Random rand = new Random();
        GregorianCalendar gc = new GregorianCalendar();
        int rndYear = rand.nextInt(33)+1990;
        int rndMonth = rand.nextInt(12)+1;
        int leapState = 28;
        int daysInMonth = -1;
        
        gc.set(GregorianCalendar.YEAR, rndYear);
        if((rndYear%4==0 && rndYear%100!=0)||(rndYear%400==0))
            leapState =29;
        gc.set(GregorianCalendar.MONTH, rndMonth);
        switch (rndMonth) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = leapState;
                break;
            default:
                daysInMonth = -1; // Indicate an invalid month
                break;
        }
        gc.set(GregorianCalendar.DATE, rand.nextInt(daysInMonth)+1);
        
        return gc;
    }
    
    public static GregorianCalendar setDate(int dia, int mes, int anio){
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.DAY_OF_MONTH, dia);
        gc.set(GregorianCalendar.MONTH, mes);
        gc.set(GregorianCalendar.YEAR, anio);
        return gc;
    }
}
