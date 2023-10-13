/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/**
 *
 * @author alumno
 */
public class MyList <E> {
    // estos son los dos punteros necesarios para la lista doblemente enlazada
    // este puntero apuntara al ULTIMO nodo añadido a la lista
    private Node<E> pointerLast;
    // este puntero apuntara al PIRMER nodo añadido a la lista
    private Node<E> pointerFirst;
    // este puntero apunta al que se esta enseñado por pantalla
    private Node<E> pointerActual;
    private int cont = 0;
    
    public MyList(){
        this.pointerLast = null;
        this.pointerFirst = null;
        this.pointerActual = null;
    }
    
    public void showMyList(){
        System.out.println("****LIST FIRST TO LAST****");
        Node<E> temp = this.pointerFirst;
        while (temp != null){
            // cuando llamas a imprimir el objeto, directamente te enseña el toString()
            System.out.println(temp.getMain());
            temp=temp.getNextNode();
        }
    }
    
    public void showMyListReverse(){
        System.out.println("****LIST IN REVERSE****");
        Node<E> temp = this.pointerLast;
        while (temp != null){
            // cuando llamas a imprimir el objeto, directamente te enseña el toString()
            System.out.println(temp.getMain());
            temp=temp.getPreviousNode();
        }
    }
    
    public void getNext(){
        this.pointerActual = this.pointerActual.getNextNode();
    }
    
    public void getPrevious(){
        this.pointerActual = this.pointerActual.getPreviousNode();
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
    
    public Node<E> getNodeByPosition(int pos){
        int auxCont = 0;
        Node<E> temp = this.pointerFirst;
        while(temp != null){
            auxCont++;
            if(auxCont == pos){
                return temp;
            }else{
                temp=temp.getNextNode();
            }
        }
        return null;
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
            System.out.println("CREADO "+this.cont);
            // iniciamos valor al nodo que iremos moviendo para ver toda la lista
            this.pointerActual = newNode;
        }else{
            Node<E> temp = this.pointerLast;
            this.pointerLast = newNode;
            temp.setNextNode(this.pointerLast);
            newNode.setNextNode(null);
            newNode.setPreviousNode(temp);
            System.out.println("CREADO "+this.cont);
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
        while (temp != null){
            //System.out.println(temp.getMain()+"  "+p);
            if(temp.getMain() == p){
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
            }
            temp=temp.getNextNode();
        }
        cont--;
    }
    
    
// Inner class

    public class Node<E>{
        private Node<E> nextNode;
        private Node<E> previousNode;
        E main;
        
        public Node(E p){
            this.nextNode = null;
            this.previousNode = null;
            this.main = p;               
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

