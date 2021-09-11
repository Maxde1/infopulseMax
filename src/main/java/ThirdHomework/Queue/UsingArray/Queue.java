package ThirdHomework.Queue.UsingArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Queue<T> {
    private int iter, capacity;
    private T[] array;
    Queue(Class<T> classT, int capacity){
        this.capacity = capacity;
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(classT, capacity);
        this.array = array;
        iter = 0;
    }
    // This method add new element to Queue.
    public boolean add(T element){
        if (iter<=capacity){
            array[iter] = element;
            iter++;
            return true;
        }
        else {
            return false;
        }
    }
    // This method return first element from Queue.
    public T getElement(){
        if (array[0]==null){
            return null;
        }
        else{
            return array[0];
        }
    }
    // this method return first element of Queue and delete it from Queue.
    public T poll(){
        T result = array[0];
        if (array[0] == null){
            return null;
        }
        else{
            array[0] = null;
            Collections.rotate(Arrays.asList(array), -1);
        }
        return result;
    }
}
