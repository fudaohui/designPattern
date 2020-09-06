package com.fdh.designpattern.observer;

public abstract class Event<T> {

    /**
     * @return 返回事件源
     */
    abstract T getEventSource();
}
