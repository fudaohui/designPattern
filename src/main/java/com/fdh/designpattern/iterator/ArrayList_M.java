package com.fdh.designpattern.iterator;

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

    @Override
    public Iterator_M iterator() {
        return new ArrayListIterator();
    }


    private class ArrayListIterator implements Iterator_M<E> {

        private int currentIndex = 0;

        @Override
        public boolean hashNext() {

            if (currentIndex >= index) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public E next() {
            E object = objects[currentIndex];
            currentIndex++;
            return object;
        }
    }
}
