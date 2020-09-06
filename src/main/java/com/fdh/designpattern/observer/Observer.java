package com.fdh.designpattern.observer;

public interface Observer {

    /**
     * 监听event，这个event可能类型不同，多种类型事件
     *
     * @param event
     */
    void onEventChange(Event event);
}
