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

/**
 * Created by smanohar on 11/12/16.
 */
public class DataStructures {


    public static void main(String[] args)  {

        System.out.println("Let's c if this works");
        BoundedQueue que = new BoundedQueue(5);

        que.enQueue("A");
        que.print();
        que.enQueue("B");
        que.enQueue("C");
        que.enQueue("D");
        que.print();
        System.out.println(que.deQueue());
        System.out.println(que.peek());
        que.print();
        System.out.println(que.deQueue());
        System.out.println(que.deQueue());
        que.print();
        System.out.println(que.deQueue());
        que.print();
        que.enQueue("F");
        que.print();
        que.enQueue("G");
        que.print();
        que.enQueue("H");
        que.print();
        que.enQueue("I");
        que.print();
        que.enQueue("J");
        que.print();
        System.out.println(que.deQueue());
        System.out.println(que.peek());



        LinkedQueue list = new LinkedQueue();
        list.enQueue("1");
        list.enQueue("2");
        list.enQueue("3");
        list.enQueue(4);
        list.enQueue("5");
        list.print();
        System.out.println(list.peek());
        list.enQueue(6);
        list.enQueue("shrav");
        list.print();
        System.out.println(list.deQueue());
        list.print();
        System.out.println(list.size());


    }
}
