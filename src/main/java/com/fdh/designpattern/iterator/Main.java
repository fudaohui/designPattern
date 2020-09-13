package com.fdh.designpattern.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        Collection_M stringArrayList_m = new ArrayList_M<String>();
//        for (int i = 0; i < 20; i++) {
//            stringArrayList_m.add("a:" + i);
//        }
//        Iterator_M iterator = stringArrayList_m.iterator();
//        while (iterator.hashNext()){
//            System.out.println(iterator.next());
//        }

        Collection_M<String> linkList_m = new LinkList_M();
        for (int i = 0; i < 20; i++) {
            linkList_m.add("link:" + i);
        }

        Iterator_M<String> iterator = linkList_m.iterator();
        while (iterator.hashNext()){
            String next = iterator.next();

            System.out.println(next);
        }

    }
}
