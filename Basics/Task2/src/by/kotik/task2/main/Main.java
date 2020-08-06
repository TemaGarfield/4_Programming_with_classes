package by.kotik.task2.main;

import by.kotik.task2.logic.Test2;

/*
 * 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, инициализирующий члены
 * класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса. */

public class Main {

	public static void main(String[] args) {
		Test2 test2Without = new Test2();
		Test2 test2With = new Test2(10, 20);
		
		System.out.println("Test2 without parameters: ");
		System.out.println("First number: " + test2Without.getFirstNumber());
		System.out.println("Second number: " + test2Without.getSecondNumber());
		
		System.out.println();
		test2Without.setFirstNumber(123);
		test2Without.setSecondNumber(321);
		System.out.println("Test2 without parameters after edditing: ");
		System.out.println("First number: " + test2Without.getFirstNumber());
		System.out.println("Second number: " + test2Without.getSecondNumber());
		
		System.out.println();
		System.out.println("Test2 with parameters: ");
		System.out.println("First number: " + test2With.getFirstNumber());
		System.out.println("Second number: " + test2With.getSecondNumber());
		
		System.out.println();
		test2With.setFirstNumber(999);
		test2With.setSecondNumber(321);
		System.out.println("Test2 with parameters after edditing: ");
		System.out.println("First number: " + test2Without.getFirstNumber());
		System.out.println("Second number: " + test2Without.getSecondNumber());

	}

}
