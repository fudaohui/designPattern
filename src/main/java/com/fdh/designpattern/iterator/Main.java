package com.fdh.designpattern.iterator;

public class Main {

    public static void main(String[] args) {
        Collection_M stringArrayList_m = new ArrayList_M<String>();
        for (int i = 0; i < 20; i++) {
            stringArrayList_m.add("a:" + i);
        }

        System.out.println(stringArrayList_m.size());

        Collection_M<String> linkList_m = new LinkList_M();
        for (int i = 0; i < 20; i++) {
            linkList_m.add("l:" + i);
        }

        System.out.println(linkList_m.size());
    }
}
