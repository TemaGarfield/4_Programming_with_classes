package by.kotik.task1.main;

import by.kotik.task1.logic.Test1;

public class Main {
	public static void main(String[] args) {
	    Test1 test = new Test1(11, 10);
	    System.out.println("Biggest: " + test.biggest());
	    System.out.println("Sum: " + test.sum());
	    test.show();
	
	    test.editX(3);
	    test.editY(7);
	
	    System.out.println();
	    test.show();
	    System.out.println("Biggest: " + test.biggest());
	    System.out.println("Sum: " + test.sum());
	}
}
