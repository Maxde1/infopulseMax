package ThirdHomework.stack.UsingArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int rear, capacity, front;

    private T[] array;

    Stack(Class<T> classT, int capacity){
        this.capacity = capacity;
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(classT, capacity);
        this.array = array;
        rear = front = 0;
    }
    public void setElem(T elem){
        if (capacity == rear){
            System.out.println("Queue is full");
        }
        else {
            array[rear] = elem;
            rear++;
        }
    }
    public T get(){
        T tempObj = null;
        if (front == rear){
            System.out.println("Queue is empty");
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
            System.out.println(rear);
        }
        return tempObj;
    }



}
