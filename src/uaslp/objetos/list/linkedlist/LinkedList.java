package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.List;
import uaslp.objetos.list.Iterator;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;


    public void addAtTail (String data){
        Node node = new Node();

        node.setPrevious(tail);
        tail = node;

        if(head == null){
            head = node;
        } else{
            node.getPrevious().setNext(node);
        }
        size ++;
    }

    @Override
    public void addAtFront(String data) {

    }

    public boolean remove(int index){
        if(index < 0 || index >= size){
            return false;
        }
        if(size == 1){
            head = null;
            tail = null;
        }else if(index == 0){
            head= head.getNext();
            head.setPrevious(null);
        }else if(index == size - 1){
            tail = tail.getPrevious();
            tail.setNext(null);
        }else{
            Node iteratorNode = findNodeByIndex(index);
            iteratorNode.getPrevious().setNext(iteratorNode.getNext());
            iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());
        }
        size--;
        return true;
    }

    public void removeAll(){
        LinkedListIterator aux= this.getIterator();
        while(aux.hasNext()){
            aux.Next();
            this.remove(0);
        }
    }

    public boolean setAt(int index, String data){
        if(index < 0 || index >= size){
            return false;
        }
        Node node = findNodeByIndex(index);

        node.setData(data);
        return true;
    }

    public String getAt(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node node = findNodeByIndex(index);
        return node.getData();
    }

    @Override
    public void removeAllWithValue(String data) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    public boolean removeWithValue(String data){
        Node iteratorNode =  head;
        int indexIteratorNode = 0;

        while(indexIteratorNode < size && iteratorNode.getData() == data){
            indexIteratorNode++;
        }
        if (indexIteratorNode != size){
            return remove(indexIteratorNode);
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public LinkedListIterator getIterator(){
        LinkedListIterator iterator = new LinkedListIterator(head);
        return iterator;
    }

    private Node findNodeByIndex(int index) {
        Node iteratorNode = head;
        int indexIteratorNode = 0;

        while (indexIteratorNode < index){
            iteratorNode = iteratorNode.getNext();
            indexIteratorNode++;
        }
        return iteratorNode;
    }
}




