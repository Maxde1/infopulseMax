package ThirdHomework.stack;


import org.w3c.dom.Node;

import java.util.Iterator;

public class Stack<T> implements Iterator<T> {
    private NodeElement<T> first;
    private NodeElement<T> last;
    private NodeElement<T> tempPrev;
    private NodeElement<T> tempGetElem;
    private NodeElement<T> current;

    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public T next() {
        T info = current.data;
        current = current.next;
        return info;
    }

    private static class NodeElement<T>{
        T data;
        NodeElement<T> next;
        NodeElement<T> prevNodeElem;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void addElement(T node){
        NodeElement<T> newNode = new NodeElement<>();
        newNode.data = node;
        if (isEmpty()){
            first = newNode;
            last = newNode;
            current = first;
        }
        else {
            tempPrev= last;
            last.next = newNode;
            last = newNode;
            last.prevNodeElem = tempPrev;
        }

    }

    public T getElement(){
        tempGetElem = last;
        last = last.prevNodeElem;
        last.next = null;
        return tempGetElem.data;
    }
    public void startPosition(){
        current = first;
    }
}
