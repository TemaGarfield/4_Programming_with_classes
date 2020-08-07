package by.kotik.task2.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String model;
    private ArrayList<Wheel> wheels;
    private Engine engine;
    private double oil;

    public Car(String model, ArrayList<Wheel> wheels, Engine engine, double oil) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
        this.oil = oil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
        this.wheels = new ArrayList<>(Arrays.asList(wheel1, wheel2, wheel3, wheel4));
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }
}
