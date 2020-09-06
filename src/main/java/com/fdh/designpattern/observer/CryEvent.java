package com.fdh.designpattern.observer;

public class CryEvent extends Event<Baby> {

    Baby baby;

    @Override
    Baby getEventSource() {
        return baby;
    }

    public CryEvent(Baby baby) {
        this.baby = baby;
    }
}
