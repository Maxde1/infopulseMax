package ThirdHomework.stack;

import org.w3c.dom.Node;

public class Queue<T> {
    private NodeElement<T> first;
    private NodeElement<T> last;

    private static class NodeElement<T>{
        T info;
        NodeElement<T> next;
        NodeElement<T> prev;
        public T getInfo(){
            return this.info;
        }
    }
    private boolean isEmpty(){
        return first == null;
    }
    public void addElement(T node){
        NodeElement<T> nodeElement = new NodeElement<>();
        NodeElement<T> tempPrev;
        nodeElement.info = node;
        if(isEmpty()){
            first = nodeElement;
            last = nodeElement;
            first.prev = null;
        }
        else{
            tempPrev = last;
            last.next = nodeElement;
            last = nodeElement;
            last.prev = tempPrev;

        }
    }
    public T getElem(){
    NodeElement<T> temp = new NodeElement<>();

    if (first == null){
        return null;
    } else if (first.next == null){
        temp = first;
        first = null;
        return temp.getInfo();
    }
    temp = first;
    first = first.next;
    first.prev = null;
    return temp.getInfo();
    }
}
