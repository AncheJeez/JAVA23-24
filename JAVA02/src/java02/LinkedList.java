/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;

//recurso utilizado
//http://www.it.uc3m.es/java/git-gisc-2013-14/units/pilas-colas/guides/2/guide_es_solution.html
//https://www.deltapci.com/java-listas-enlazadas-simples/

public class LinkedList {
    
    protected Node<Empleado> first;
    protected Node<Empleado> anterior;

    //aqui cuando iniciamos la lista, igualando el primero a null
    public LinkedList() {
        this.first = null;
    }
    
    // en este metodo cogemos al primero
    public Node<Empleado> getFirst(){
        return this.first;
    }
    
    // establecemos el primer nodo
    public void setFirst(Node<Empleado> first){
        this.first = first;
    }
    
    public void setAnterior(Node<Empleado> anterior){
        this.anterior = anterior;
    }
    
    // este metodod te devuelve true o false si la lista esta vacia
    public boolean isEmpty(){
        return (this.first == null);
    }
    
    // metodo que automatiza el sistema de introducir
    public void insertRegardless(Empleado empleado){
        
        // introducimos si es el primero
        if(this.first == null){
            Node nodo = new Node(empleado);
            this.setFirst(nodo);
            this.insert(empleado);
            this.setAnterior(nodo);
        }else if(this.first != null){
            Node nodo = new Node(empleado);
            this.insert(empleado, anterior);
        }
    }
    
    // metodo para insertar el empleado que es primero
    public void insert(Empleado empleado){
        Node<Empleado> newNode = new Node<Empleado>(empleado);
        newNode.setNext(this.first);
        first = newNode;
    }
    
    // metodo para extraer el Empleado primero de la lista
    public Empleado extract(){
        Empleado data = null;
        if(this.first != null){
            data = this.first.getEmpleado();
            this.first = this.first.getNext();
        }
        return data;
    }
    
    // metodo para insertar cuando no es el primero
    public void insert(Empleado empleado, Node<Empleado> previous){
        if(previous != null){
            Node<Empleado> newNode = new Node<Empleado>(empleado);
            newNode.setNext(previous.getNext());
            previous.setNext(newNode);
        }
    }
    
    // metodo para extraer el Empleado que no sea el primero de la lista
    public Empleado extract(Node<Empleado> previous){
        Empleado data = null;
        if(previous != null && previous.getNext() != null){
            data = previous.getNext().getEmpleado();
            previous.setNext(previous.getNext().getNext());
        }
        return data;
    }
    
    // metodo para saber el tamaño de la lista
    public int size(){
        int size = 0;
        Node<Empleado> current = this.first;
        
        while(current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }
    
    /**
     * metodo toString
     * @return String listText 
     */
    public String toString(){
        String listText = "";
        Node<Empleado> current = this.first;
        
        while(current != null){
            listText = listText + current.getEmpleado().toString();
            if(current.getNext() != null){
                listText = listText + " -> ";
            }
            current = current.getNext();
        }
        return listText;
    }
    
    public void print(){
        System.out.println(this);
    }
    
    // metodo que devuelve el objeto Node<Empleado> que contiene empleado
    public Node<Empleado> searchNode(Empleado empleado){
        Node<Empleado> targetNode = null;
        Node<Empleado> currentNode = this.first;
        
        while(currentNode != null && !currentNode.getEmpleado().equals(empleado)){
            currentNode = currentNode.getNext();
        }
        if(currentNode != null){
            targetNode = currentNode;
        }
        return targetNode;
    }
    
    // metodo que devuelve el Node<Empleado> que este en la posicion n de la lista
    public Node<Empleado> searchNode(int n){
        Node<Empleado> targetNode = null;
        Node<Empleado> currentNode = this.first;
        int counter = 0;
        
        while(currentNode != null && counter<n){
            currentNode = currentNode.getNext();
            counter++;
        }
        if(currentNode!=null){
            targetNode = currentNode;
        }
        return targetNode;
    }
    
    // devuelve ultimo Nodo<Empleado>
    public Node<Empleado> searchLastNode(){
        Node<Empleado> current = this.first;
        
        while(current != null && current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }
    
    // devuelve un int de la posicion del Node<Empleado>
    public int search(Empleado empleado){
        Node<Empleado> current = this.first;
        int infoPosition = -1;
        
        if(!isEmpty()){
            infoPosition = 0;
            while(current != null && !current.getEmpleado().equals(empleado)){
                infoPosition++;
                current = current.getNext();
            }
        }
        return infoPosition;
    }
    
    public int numberOfOcurrences(Empleado empleado){
        int counter = 0;
        Node<Empleado> current = this.first;
        
        while(current != null){
            if(current.getEmpleado().equals(empleado)){
                counter++;
            }
            current = current.getNext();
        }
        return counter;
    }
    
    
}
