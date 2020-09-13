package com.fdh.designpattern.iterator;

import java.util.LinkedList;

public class LinkList_M<E> implements Collection_M<E> {

    private Node head = null;
    private Node tail = null;

    private int size = 0;

    @Override
    public void add(E e) {
        Node node = new Node(e);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node<E> {
        private E e;
        private Node next;
        private Node pre;//删除时候有用

        public Node(E e) {
            this.e = e;
        }
    }

    @Override
    public Iterator_M iterator() {
        return new LinkListIterator_M(0);
    }

    private class LinkListIterator_M implements Iterator_M<E> {

        private Node<E> next;
        private int nextIndex;

        private Node<E> lastReturn;

        public LinkListIterator_M(int index) {
            if (index == size) {
                next = null;
            } else {
                next = node(index);
                nextIndex = index;
            }
        }


        @Override
        public boolean hashNext() {
            if (nextIndex < size) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {

            lastReturn = this.next;
            next = this.next.next;
            nextIndex++;

            return lastReturn.e;
        }
    }


    /**
     * 从头遍历
     *
     * @param index
     * @return
     */
    Node<E> node(int index) {

        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        // TODO: 2020/9/13 带实现从尾部遍历
        return node;
    }
}
