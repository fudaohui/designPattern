package com.fdh.designpattern.factory;

public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Air();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
