package com.fdh.designpattern.observer;

public class Main {


    /**
     * 事件源触发事件（先添加监听者），监听者监听动作并执行
     * @param args
     */
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.setName("pipi");
        baby.add(new DadObserver());
        baby.add(new MomObserver());
        baby.onWakeUp();
        baby.onCry();
    }
}
