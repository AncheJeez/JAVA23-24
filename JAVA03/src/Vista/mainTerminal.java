/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Leer;
import Controlador.MyList;
import Modelo.Empleado;

/**
 *
 * @author alumno
 */
public class mainTerminal {
    
    public static void main(String[] args) {
        
        MyList listaEmpleados = new MyList();
        
        for(int i=0;i<5;i++){
            Empleado e = new Empleado(i+1);
            listaEmpleados.add(e);
        }
        
        // MOSTRAR LOS NODOS DE AMBAS FORMAS
        listaEmpleados.showMyList();
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        listaEmpleados.showMyListReverse();
        System.out.println("\nPOINTER FIRST "+listaEmpleados.getPointerFirst().getMain());
        System.out.println("POINTER LAST "+listaEmpleados.getPointerLast().getMain()+"\n");
        
        // ACCEDER A UN NODO CONCRETO
        System.out.println("BUSCANDO NODO 3: "+listaEmpleados.getNodeByPosition(3).getMain());
        
        // BORRAR UN NODO
        System.out.println("BORRANDO NODO 3");
        listaEmpleados.remove(listaEmpleados.getNodeByPosition(3).getMain());
        System.out.println("BORRADO NODO 3");
        
        // MODIFICAR UN NODO
        System.out.println("MODIFICADO NODO 2");
        Empleado modificacion = new Empleado(8,"Andres","Sanchez",2100);
        listaEmpleados.modify(listaEmpleados.getNodeByPosition(2).getMain(), modificacion);
        
        listaEmpleados.showMyList();
        
        System.out.println("CURRENT NODO: "+listaEmpleados.getPointerActual().getMain());
        listaEmpleados.getNext();
        System.out.println("CURRENT NODO: "+listaEmpleados.getPointerActual().getMain());
        listaEmpleados.getNext();
        System.out.println("CURRENT NODO: "+listaEmpleados.getPointerActual().getMain());
        
        //int givenNumber = 0;
//        while(givenNumber != 6){
//            
//            System.out.println(">> INTRODUZCA UNA OPCION (1 avanzar, 2 retroceder, 6 salir): ");
//            givenNumber = Leer.datoInt();
//            
//            if(givenNumber == 1){
//                //listaEmpleados.showLast();
//            }
//        }
    }
}
