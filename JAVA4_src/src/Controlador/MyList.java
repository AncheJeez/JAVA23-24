/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author andres
 */

public class MyList <E> implements Serializable{
    
    private Node<E> pointerLast;
    private Node<E> pointerFirst;
    private Node<E> pointerActual;
    private int cont = 0;
    
    public MyList(){
        this.pointerLast = null;
        this.pointerFirst = null;
        this.pointerActual = null;  
    }
    
    public void showMyList(){
        Node<E> temp = this.pointerFirst;
        while (temp != null){
            System.out.println("Indice: "+temp.getIndice());
            System.out.println(temp.getMain());
            temp=temp.getNextNode();
        }
    }
    
    public void getNext(){
        this.pointerActual = this.pointerActual.getNextNode();
    }
    
    public void getPrevious(){
        this.pointerActual = this.pointerActual.getPreviousNode();
    }
    
    public void getFirst(){
        this.pointerActual = this.pointerFirst;
    }
    
    public void getLast(){
        this.pointerActual = this.pointerLast;
    }
    
    public boolean isFirst(){
        if(this.pointerActual.getPreviousNode() != null){
            return false;
        }else
            return true;
    }
    
    public boolean isLast(){
        if(this.pointerActual.getNextNode() != null){
            return false;
        }else
            return true;
    }
    
    public boolean isEmpty(){
        if(cont <= 0)
            return true;
        else
            return false;
    }
    
    //nos indica si existe o no un empleado por su número
    public boolean exists(Node n){
        Node<E> temp = this.pointerFirst;
        while(temp != null){
            if(temp == n){
                return true;
            }else{
                temp=temp.getNextNode();
            }
        }
        return false;
    }
    
    public void serialization(String name, String path){
        
        try {
            //FileOutputStream fileOut = new FileOutputStream("MyListSerializated.ser");
            FileOutputStream fileOut = new FileOutputStream(path+"/"+name+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //out.writeObject(this);
            Node aux = this.pointerFirst;
            
            while(aux != null){
                out.writeObject(aux.getMain());
                aux = aux.getNextNode();
            }
            
            out.close();
            fileOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<E> deserialization(String filePath){
        List<E> lista = new ArrayList<E>();
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //nuevaLista = (MyList) in.readObject();
            
            // while(in.available()>0){ NO FUNCIONA
            try{
                while(true){
                    // si añadimos los empleados desde aqui, no podemos añadir el indice de los empleados
                    // asi q los metemos en un arraylist los empleados para añadirlos luego
                    // a la lista con el indice
                    //add((E)in.readObject());
                    lista.add((E)in.readObject());
                }
            }catch(EOFException ex){};
            
            in.close();
            fileIn.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ha ocurrido un error con la eleccion del fichero, puede que no sea tipo .ser o el contenido es de una version anterior.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    // este intercambiar esta mal, hay q hacerlo sin tocar punteros
    public void itercambiarPunteros(int num1, int num2){
        Node <E> temp = this.pointerFirst;
        Node<E> node1 = null;
        Node<E> node2 = null;
        while(temp != null){
            if(temp.getIndice()+1 == num1){
                node1 = temp;
            }else if(temp.getIndice()+1 == num2){
                node2 = temp;
            }
            temp=temp.getNextNode();
            // para no seguir iterando sin necesidad
            if(node1 != null && node2 != null)
                break;
        }
        
        if(node1 == null || node2 == null){
            System.out.println("No se encontro alguno/s de los nodos indicados");
        }else{
            Node<E> tempNext = node1.getNextNode();
            Node<E> tempPrev = node1.getPreviousNode();
            
            node1.setNextNode(node2.getNextNode());
            node1.setPreviousNode(node2.getPreviousNode());
            node2.setNextNode(tempNext);
            node2.setPreviousNode(tempPrev);
            
            if (node1.getPreviousNode() != null) {
                node1.getPreviousNode().setNextNode(node1);
            } else{
                pointerFirst = node1;
            }
            if (node2.getPreviousNode() != null) {
                node2.getPreviousNode().setNextNode(node2);
            } else{
                pointerFirst = node2;
            }
            if (node1.getNextNode() != null) {
                node1.getNextNode().setPreviousNode(node1);
            } else{
                pointerLast = node1;
            }
            if (node2.getNextNode() != null) {
                node2.getNextNode().setPreviousNode(node2);
            } else{
                pointerLast = node1;
            }
            System.out.println("Intercamio realizado");
        }
    }
    
    public void intercambiarMain(Node n1, Node n2){
        Node<E> node1 = n1;
        Node<E> node2 = n2;

        int indexAux = node1.getIndice();
        node1.setIndice(node2.getIndice());
        node2.setIndice(indexAux);

        E tempMain= node1.getMain();
        node1.setMain(node2.getMain());
        node2.setMain(tempMain);
        //System.out.println("Intercamio realizado");
    }
    
    //Ordena la lista por número de empleado con el método de la burbuja u otro
    // este metodo da problemas cuando se repiten mismos valores por los que ordenar
    public void sort(){
        boolean swapped = false;
        int listSize = this.cont-1;
        do{
            swapped= false;
            Node<E> node1 = this.pointerFirst;
            Node<E> node2  = node1.getNextNode();
            for(int i=0;i<listSize;i++){
                if(node1.getIndice()>node2.getIndice()){
                    intercambiarMain(node1,node2);
                    swapped = true;
                }
                node1 = node1.getNextNode();
                node2 = node2.getNextNode();
            }
            System.out.println("QUEDAN "+listSize+" LINEAS");
            listSize--;
        }while(swapped);
    }
    
//    public Node<E> getNodeByPosition(int pos){
//        int auxCont = 0;
//        Node<E> temp = this.pointerFirst;
//        while(temp != null){
//            if(auxCont == pos){
//                return temp;
//            }else{
//                temp=temp.getNextNode();
//                auxCont++;
//            }
//        }
//        return null;
//    }
    
    public Node<E> getNode(int num){
        Node<E> aux = this.pointerFirst;
        
        while(aux.getIndice() != num){
            aux = aux.getNextNode();
        }
        
        return aux;
    }
    
    public Node<E> getCurrentNode(){
        Node<E> temp = this.pointerActual;
        return temp;
    }
    
    public void add(E p){
        Node<E> newNode = new Node(p);
        this.cont++;
        if(this.pointerFirst == null){
            newNode.setNextNode(null);
            newNode.setPreviousNode(null);
            this.pointerFirst = newNode;
            this.pointerLast = newNode;
            // iniciamos valor al nodo que iremos moviendo para ver toda la lista
            this.pointerActual = newNode;
        }else{
            Node<E> temp = this.pointerLast;
            this.pointerLast = newNode;
            temp.setNextNode(this.pointerLast);
            newNode.setNextNode(null);
            newNode.setPreviousNode(temp);
        }
    }

    public Node<E> getPointerLast() {
        return pointerLast;
    }

    public Node<E> getPointerFirst() {
        return pointerFirst;
    }

    public Node<E> getPointerActual() {
        return pointerActual;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void modify(E nodeToModify,E newData){
        Node<E> temp = this.pointerFirst;
        while (temp != null){
            if(temp.getMain() == nodeToModify){
                temp.setMain(newData);
                break;
            }
            temp=temp.getNextNode();
        }
    }
    
    public void remove(E p){
        
        Node<E> temp = this.pointerFirst;
        boolean flag = false;
        int indTemp = 0;
        while (temp != null){
            if(temp.getMain() == p){
                cont--;
                Node <E> auxRight = temp.getNextNode();
                Node <E> auxLeft = temp.getPreviousNode();
                
                if (auxLeft != null) {
                    auxLeft.setNextNode(auxRight);
                } else {
                    this.pointerFirst = auxRight;
                }
                if (auxRight != null) {
                    auxRight.setPreviousNode(auxLeft);
                }
                
                if(this.pointerActual.isFirst()){
                    this.pointerActual = auxRight;
                }else{
                    this.pointerActual = auxLeft;
                }
                break;
//                flag = true;
//                indTemp = temp.getIndice();
            }
            temp=temp.getNextNode();
            // con esto seguimos recorriendo el resto de la lista y modificamos el indice de cada nodo,
            // reduciendolo en 1 :) por eso quitamos el break de arriba.
//            if(flag){
//                temp.setIndice(indTemp);
//                indTemp+=1;
//            }
        }
    }
    
    public void updateCurrentNode(E p){
        if(getCurrentNode() != null){
            getCurrentNode().setMain(p);
        }
    }
    
    public void deleteAll(){
        this.cont = 0;
        this.pointerLast = null;
        this.pointerFirst = null;
        this.pointerActual = null;
    }
    
    //public class Node<E extends Sortable<E>>{
    public class Node<E> implements Serializable{
        private Node<E> nextNode;
        private Node<E> previousNode;
        // para guardar el numero de del objeto
        private int indice;
        E main;
        
        public Node(E p){
            this.nextNode = null;
            this.previousNode = null;
            this.main = p;   
        }
        
        public Node(E p, int indic){
            this(p);
            this.indice = indic;
        }
        
        public int compareTo(Node<E> other) {
            // Compare based on the 'indice' property
            return Integer.compare(this.indice, other.indice);
        }
        
        public Node<E> getNextNode() {
            return this.nextNode;
        }
        
        public Node<E> getPreviousNode(){
            return this.previousNode;
        }

        public void setNextNode(Node<E> pointerLast) {
            this.nextNode = pointerLast;
        }
        
        public void setPreviousNode(Node<E> pointerFirst){
            this.previousNode = pointerFirst;
        }

        public int getIndice() {
            return indice;
        }

        public void setIndice(int indice) {
            this.indice = indice;
        }

        public E getMain() {
            return main;
        }

        public void setMain(E p) {
            this.main = p;
        }
        
        public boolean isFirst(){
            if(this.previousNode == null)
                return true;
            else
                return false;
        }
        
        public boolean isLast(){
            if(this.nextNode == null)
                return true;
            else
                return false;
        }
    }
}
