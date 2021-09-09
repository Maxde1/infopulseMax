package ThirdHomework.Queue.UsingArray;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class Queue<T> {
    private int rear, capacity, front, nElement, currentSize;

    private T[] array;

    Queue(Class<T> classT, int capacity){
        this.capacity = capacity;
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(classT, capacity);
        this.array = array;
        rear = -1;
        nElement = front = currentSize = 0;

    }
    public void addElem(T elem){
        if (currentSize == capacity){
            System.out.println("This is full");
        } else {
            rear++;
            if (rear == capacity-1){
                rear = 0;
            }
            array[rear] = elem;
            currentSize++;
        }
    }
    public T get(){
        if (currentSize == 0){
            System.out.println("Queue is empty");
        } else {
            front++;
            if (front == capacity -1){
                front = 0;
            }
            else {

            }
        }
        nElement--;
        return temp;
    }

    }



