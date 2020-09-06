package com.fdh.designpattern.builder;


/**
 * builder模式在面对复杂对象，属性众多且属性可以设置不使用的情况下比较有用
 */
public class Main {
    public static void main(String[] args) {

        Person person = Person.buider()
                .basicInfo(10, "aaa", 18)
                .weight(80)
//                .score(100)
                .loc("中南海", "88号")
                .build();
        System.out.println(person);

    }
}
