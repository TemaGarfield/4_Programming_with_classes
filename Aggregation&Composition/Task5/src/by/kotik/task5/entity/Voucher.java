package by.kotik.task5.entity;

public class Voucher {
    private String type;
    private String transport;
    private int nutrition;
    private int numberOfDays;

    public Voucher(String type, String transport, int nutrition, int numberOfDays) {
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.numberOfDays = numberOfDays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getNutrition() {
        return nutrition;
    }

    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    
    @Override
    public String toString() {
        return "Voucher{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", nutrition='" + nutrition + '\'' +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
