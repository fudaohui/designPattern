package com.fdh.designpattern.observer;

public class MomObserver implements Observer {

    @Override
    public void onEventChange(Event event) {
        if (event instanceof WakeUpEvent) {
            Baby baby = (Baby) event.getEventSource();
            System.out.println("mum:  My baby:" + baby.getName() + " wakeUp,milk comming!");
        } else if (event instanceof CryEvent) {
            Baby baby = (Baby) event.getEventSource();
            System.out.println("mum:  My baby:" + baby.getName() + " crying,mum huging!");
        }
    }
}
