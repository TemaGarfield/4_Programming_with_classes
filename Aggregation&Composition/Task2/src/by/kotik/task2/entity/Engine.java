package by.kotik.task2.entity;

public class Engine {
    private double power;
    private double capacity;

    public Engine(double power, double capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
