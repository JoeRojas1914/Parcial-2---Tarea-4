import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {
    public static void main(String args[]){
        List lista2 = new ArrayList();

        lista2.addAtFront("B");
        lista2.addAtFront("A");
        lista2.addAtTail("c");


        int indexIterator = 0;
        while (indexIterator < lista2.getSize()){
            System.out.println(lista2.getAt(indexIterator));
            indexIterator++;
        }
    }


}
