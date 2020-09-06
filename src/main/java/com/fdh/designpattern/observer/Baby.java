package com.fdh.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Baby {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Observer> observers = new ArrayList<>();


    public void add(Observer observer) {
        observers.add(observer);
    }

    // TODO: 2020/9/6  此处循环执行存在阻塞系统的风险，生产可以线程池异步执行
    public void onWakeUp() {
        //通知事件源
        for (Observer observer : observers) {
            observer.onEventChange(new WakeUpEvent("10点", this));
        }
    }

    public void onCry() {
        //通知事件源
        for (Observer observer : observers) {
            observer.onEventChange(new CryEvent(this));
        }
    }

}



