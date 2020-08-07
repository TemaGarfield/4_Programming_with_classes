package by.kotik.task4.entity;

public class Account {
    private static int startId = 0;
    private int id;
    private double balance;
    private boolean isActive = true;

    public Account(double balance) {
        this.balance = balance;
        this.id = ++startId;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
