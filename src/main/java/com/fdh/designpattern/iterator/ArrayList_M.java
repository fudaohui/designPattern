package com.fdh.designpattern.iterator;

import java.util.Objects;

public class ArrayList_M<E> implements Collection_M<E> {

    int index = 0;

    E[] objects = (E[]) new Object[10];


    @Override
    public void add(E e) {

        if (index >= objects.length) {
            E[] newObjects = (E[]) new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = e;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

}
