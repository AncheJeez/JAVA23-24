/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;

//recurso utilizado
//http://www.it.uc3m.es/java/git-gisc-2013-14/units/pilas-colas/guides/2/guide_es_solution.html

// en vez de <Empleado> se podria utilizar <E> o <T> para que sea generico
public class Node<Empleado> {
    
    private Empleado empleado;
    
    private Node<Empleado> next;
    
    
    public Node(Empleado empleado, Node<Empleado> next){
        this.empleado = empleado;
        this.next = next;
    }
    
    public Node(Empleado empleado){
        this(empleado,null);
    }
    
    // este es solo de prueba
    public Node(){
        this(null,null);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Node<Empleado> getNext() {
        return next;
    }

    public void setNext(Node<Empleado> next) {
        this.next = next;
    }
    
    public String toString(){
        if (empleado != null)
            return empleado.toString();
        else
            return null;
    }
}
