package by.kotik.task2.main;

import java.util.ArrayList;
import java.util.Arrays;

import by.kotik.task2.entity.Car;
import by.kotik.task2.entity.Engine;
import by.kotik.task2.entity.Wheel;
import by.kotik.task2.logic.CarLogic;

public class Main {
	public static void main(String[] args) {
		Wheel michelin = new Wheel(15);
		Car audi = new Car("AUDI", new ArrayList<Wheel>(Arrays.asList(michelin, michelin, michelin, michelin)), new Engine(123, 321), 100);
		
		CarLogic.drive(audi);
		System.out.println("Model: " + audi.getModel());
		System.out.println("Fuel before refueling: " + audi.getOil());
		CarLogic.refuel(7.2, audi);
		System.out.println("Fuel after refueling: " + audi.getOil());
		System.out.print("Wheels before changing: ");
		CarLogic.showWheels(audi);
		CarLogic.changeWheel(2, new Wheel(11), audi);
        System.out.print("\nWheels after changing: ");
        CarLogic.showWheels(audi);
	}
}
