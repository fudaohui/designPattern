package com.fdh.designpattern.observer;

public class WakeUpEvent extends Event<Baby> {
    String timeStr;

    Baby baby;

    public WakeUpEvent(String time, Baby baby) {
        this.timeStr = time;
        this.baby = baby;
    }

    @Override
    Baby getEventSource() {
        return baby;
    }
}
