package by.kotik.task5.main;

import by.kotik.task5.logic.Counter;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояния. Написать код, демонстрирующий 
 * все возможности класса.*/

public class Main {

	public static void main(String[] args) {
        System.out.println("Counter without parameters.");
        Counter counterWithout = new Counter();
        
        
        
        counterWithout.decrease();
        System.out.println("Decrease: " + counterWithout.getNow());
        counterWithout.increase();
        System.out.println("Increase: " + counterWithout.getNow());
        
        System.out.println("Counter with parameters.");
        Counter counterWith = new Counter(7, 17, 16);
        counterWith.increase();
        System.out.println("Increase: " + counterWith.getNow());
        counterWith.increase();
        System.out.println("Increase: " + counterWith.getNow());
        counterWith.increase();
        System.out.println("Increase: " + counterWith.getNow());
        counterWith.decrease();
        System.out.println("Decrease: " + counterWith.getNow());
        counterWith.decrease();
        System.out.println("Decrease: " + counterWith.getNow());
        
	}

}
