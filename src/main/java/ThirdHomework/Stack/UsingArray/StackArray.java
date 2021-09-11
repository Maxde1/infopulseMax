package ThirdHomework.Stack.UsingArray;

import java.lang.reflect.Array;

public class StackArray<T> {
    private int rear, capacity, front;

    private T[] array;

    public StackArray(Class<T> classT, int capacity){
        this.capacity = capacity;
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(classT, capacity);
        this.array = array;
        rear = front = 0;
    }
    public boolean setElem(T elem){
        if (capacity == rear){
            return false;
        }
        else {
            array[rear] = elem;
            rear++;
            return true;
        }
    }
    public T get(){
        T tempObj = null;
        if (front == rear){
            front = rear = 0;
            return null;
        }
        else{
            for (int i = 0; i < rear-2; i++){
                array[i] = array[i+1];
            }
            if (rear < capacity){
                tempObj = array[rear-1];
                array[rear] = null;
            }
            rear--;
        }
        return tempObj;
    }



}
