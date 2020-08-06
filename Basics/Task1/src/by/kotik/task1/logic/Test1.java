package by.kotik.task1.logic;

public class Test1 {
    private int firstNumber = 666;
    private int secondNumber = 13;
    
    public Test1(int firstNumber, int secondNumber) {
    	this.firstNumber = firstNumber;
    	this.secondNumber = secondNumber;
    }
    
    public void setFirstNumber(int firstNumber) {
    	this.firstNumber = firstNumber;
    }
    
    public void setSecondNumber(int secondNumber) {
    	this.secondNumber = secondNumber;
    }
    
    public int getFirstNumber() {
    	return firstNumber;
    }
    
    public int getSecondNumber() {
    	return secondNumber;
    }

    public void show() {
        System.out.println("1st number: " + getFirstNumber() + "\n2nd number: " + getSecondNumber());
    }

    public int sum() {
        return getFirstNumber() + getSecondNumber();
    }

    public int biggest() {
        if (getFirstNumber() > getSecondNumber()) {
            return getFirstNumber();
        } else {
            return getSecondNumber();
        }
    }

    public int editX(int number) {
        setFirstNumber(number);
        return getFirstNumber();
    }

    public int editY(int number) {
        setSecondNumber(number);
        return getSecondNumber();
    }
}
