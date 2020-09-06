package com.fdh.designpattern.factory;

public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {

        return new Car();
    }
}
