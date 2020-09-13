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

    private class Node {
        private E e;
        private Node next;
        private Node pre;//删除时候有用

        public Node(E e) {
            this.e = e;
        }
    }
}
