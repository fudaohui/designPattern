package com.fdh.designpattern.observer;

public class DadObserver implements Observer {
    @Override
    public void onEventChange(Event event) {
        if (event instanceof WakeUpEvent) {
            Baby baby = (Baby) event.getEventSource();
            System.out.println("dad:  My baby:" + baby.getName() + " wakeUp, water coming");
        } else if (event instanceof CryEvent) {
            Baby baby = (Baby) event.getEventSource();
            System.out.println("dad:  My baby:" + baby.getName() + " crying,shut up!");
        }
    }
}
