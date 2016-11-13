/*************************************************************************
 * ADOBE CONFIDENTIAL ___________________
 * <p/>
 * Copyright 2015 Adobe Systems Incorporated All Rights Reserved.
 * <p/>
 * NOTICE: All information contained herein is, and remains the property of Adobe Systems
 * Incorporated and its suppliers, if any. The intellectual and technical concepts contained herein
 * are proprietary to Adobe Systems Incorporated and its suppliers and are protected by all
 * applicable intellectual property laws, including trade secret and copyright laws. Dissemination
 * of this information or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Adobe Systems Incorporated.
 **************************************************************************/
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by smanohar on 11/12/16.
 */
public class LinkedQueue implements Queue {

    private class Node{

        public Object data;
        public Node next;

        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }

    }

    private Node front = null;
    private Node rear = null;

    @Override
    public void enQueue(Object element){

        Node tmp = new Node(element,null);

        //this is the first element
        if(isEmpty()){
          front = tmp;
        }

        //if there is one element
        else{

            rear.next = tmp;
        }
        rear = tmp;

    }


    @Override
    public Object deQueue(){

        if(isEmpty()){
            throw new NoSuchElementException("Q is empty");
        }

        Object tmp = front.data;
        if(front == rear){
            rear = null;
        }
        front = front.next;
        return tmp;

    }

    @Override
    public Object peek(){

        if(isEmpty()){
            throw new NoSuchElementException("the queue is empty");
        }

        Object element = front.data;

        return element;
    }


    @Override
    public boolean isEmpty(){

        if(front == null) return true;
        return false;
    }


    @Override
    public int size(){
        int size = 0;
        for(Node i= front; i != null;  i = i.next){
            size ++ ;

        }
        return size;
    }

    public void print(){

        List myList = new ArrayList();
        for(Node i= front; i != null;  i = i.next){
            myList.add(i.data);
        }
        System.out.println("Contents of the Queue "+ myList.toString());
    }








}
