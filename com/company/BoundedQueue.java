package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Queue implementation
 * enqueue
 * deQueue
 * isFull
 * isEmpty
 *
 */
public class BoundedQueue implements Queue{

    public Object[] array;

    int front = 0;

    int rear = 0;

    int size = 0;

    public BoundedQueue(int capacity){

        array = new Object[capacity];
    }

    /**
     *
     * @param element
     */
    @Override
    public void enQueue(Object element){

        if(isFull()){
            throw new IllegalStateException("Queue is full, cannot insert element");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
        size++;

    }


    @Override
    public Object deQueue(){

        Object element;

        if(isEmpty()){
           throw new NoSuchElementException("The Q is empty, nothing to remove");
        }

        element = array[front];
        array[front] = null;
        front = (front + 1)%array.length;
        size -- ;
        return element;
    }


    @Override
    public Object peek(){
        if(isEmpty()){
            throw new NoSuchElementException(" No element in the Q");
        }
        return array[size-1];
    }


    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){

        if(size == 0){
            return true;
        }
        return false;

    }

    private boolean isFull(){

        if(size == array.length){
            return true;
        }
        return false;
    }

    public void print(){
        System.out.print("front is "+ front + " rear is "+ rear + " " + Arrays.toString(array) + "\n");

    }

}
