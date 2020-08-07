package by.kotik.task2.logic;

import by.kotik.task2.entity.Car;
import by.kotik.task2.entity.Wheel;

public class CarLogic {
	
	
	
	public static void drive(Car car) {
		EngineLogic.startEngine();
		System.out.println("Eron-don-don");
	}
	
	public static void refuel(double litres, Car car) {
		car.setOil(car.getOil() + litres);
	}
	
	public static void changeWheel(int wheelNumber, Wheel wheel, Car car) {
		car.getWheels().set(wheelNumber, wheel);
	}
	
	public static void showWheels(Car car) {
		for (Wheel wheel:car.getWheels()) {
			System.out.print(wheel.getRadius() + " ");
		}
	}
}
