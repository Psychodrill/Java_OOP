package Classes.Generics;

import java.util.Iterator;

public class MyLinkedList <T extends Comparable <T>> implements MyList <T>{

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size=0;

    public MyLinkedList(){

        lastNode= new Node<T>(null, firstNode, null);
        firstNode=new Node<T>(null, null, lastNode);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int counter =size-1;
            @Override
            public boolean hasNext() {
                return counter>=0;

            }
            @Override
            public T next() {
                return get(counter--);

            }
        };
    }

    @Override
    public void add(T element) {

        Node<T> addedNode = lastNode;
        addedNode.setCurrentElement(element);
        lastNode=new Node<T>(null, addedNode, null);
        addedNode.setNextNode(lastNode);
        size++;


    }

    @Override
    public void delete(int index) {
        Node<T> target =getNode(index);

        Node<T> next =target.getNextNode();
        Node<T> prev =target.getPrevNode();
        if(prev!=null){
            prev.setNextNode(next);
        }else{
            firstNode.next=next.prev;
        }

       if(next!=null){
            next.setPrevNode(prev);
        }
        target.remove();
        size--;
        
    }

    @Override
    public void delete(T element) {
        int index=-1;
        for (int i = 0; i < size; i++) {
            T el = this.get(i);
            if (el.equals(element)){
                index=i;
            }
        }
        delete(index);;
        //size--;
    }

    @Override
    public T get(int index) {

        return getNode(index).getCurrentElement();

    }
    public Node<T> getNode(int index) {
        Node<T> target = firstNode;
        for (int i = 0; i <= index; i++) {
            target =target.getNextNode(); 
        }
        return target;

    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {

            builder.append(get(i)).append(", ");
        }
        if (builder.length() == 1) return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

    private class Node<T>{

        private T item;
        private Node<T> next;
        private Node<T> prev;

        Node(T element, Node<T> previNode, Node<T> nextnode){
            this.item=element;
            this.prev=previNode;
            this.next=nextnode;

        }

        public Node<T> getNextNode() {
            
            return next;
        }
        public Node<T> getPrevNode() {
            
            return prev;
        }

        public T getCurrentElement() {
            return this.item;

        }

        public void setNextNode(Node<T> nextNode) {
            this.next=nextNode;
        }
        public void setPrevNode(Node<T> prevNode) {
            this.prev=prevNode;
        }

        public void setCurrentElement(T element){
            this.item=element;
        }
        public void remove() {
            this.next=null;
            this.prev=null;
            this.item=null;
        }


    }


}


