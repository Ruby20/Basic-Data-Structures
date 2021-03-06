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
public interface Stack {

    /** Based on the LIFO principle,
     * operations
     *
     * push(x)
     * pop()
     * peek()
     * size()
     * isEmpty()
     */

    Object pop();

    void push(Object element);

    Object peek();

    boolean isEmpty();

    int size();

}
