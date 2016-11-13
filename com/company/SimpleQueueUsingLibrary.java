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

import java.util.LinkedList;

/**
 * Created by smanohar on 11/12/16.
 */
public class SimpleQueueUsingLibrary implements Queue {


    LinkedList<Object> list = new LinkedList<Object>();

    @Override
    public void enQueue(Object elemen){
        list.addLast(elemen);
    }

    @Override
    public Object deQueue(){
        return list.removeFirst();
    }

    @Override
    public int size(){
        return list.size();
    }

    @Override
    public Object peek(){
        return list.getFirst();
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }





}
