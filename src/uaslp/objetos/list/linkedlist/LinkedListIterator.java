package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {
    private Node iterator;

    LinkedListIterator(Node node){
        this.iterator = node;
    }

    public boolean hasNext(){
        return iterator.getNext() != null;
    }

    public String Next(){
        if(iterator.getNext() != null) {
            String data = iterator.getData();
            iterator = iterator.getNext();
            return data;
        }else {
            return null;
        }
    }
}
