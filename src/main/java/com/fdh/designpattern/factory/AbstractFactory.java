package com.fdh.designpattern.factory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();
}
