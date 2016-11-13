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
public interface Queue{

    /**put item in the queue */
    void enQueue(Object element);

    /** return the first item in the queue based on FIFO order */
    Object deQueue();

    /**return first item currently in the queue without removing it */
    Object peek();

    /** return the number of items in the queue */
    int size();

    /** show whether the Q is empty */
    boolean isEmpty();



}
