package ThirdHomework.stack.UsingLinkedList;


import java.util.Iterator;

public class Stack<T>{
    private NodeElement<T> first;
    private NodeElement<T> last;


    private static class NodeElement<T>{
        T data;
        NodeElement<T> next;
        NodeElement<T> prev;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void addElement(T node){
        NodeElement<T> newNode = new NodeElement<>();
        newNode.data = node;
        NodeElement<T> tempPrev;
        if (isEmpty()){
            first = newNode;
            last = newNode;
            first.prev = null;
        }
        else {
            tempPrev= last;
            last.next = newNode;
            last = newNode;
            last.prev = tempPrev;
        }

    }

    public T getElement(){
        NodeElement<T> tempCheckElem;
        if (last == null){
            return  null;
        }
        else if(last.prev == null){
            tempCheckElem = last;
            last = null;
            first = null;
            return tempCheckElem.data;
        }
        NodeElement<T> tempGetElem;
        tempGetElem = last;
        last = last.prev;
        last.next = null;
        return tempGetElem.data;
    }

}
