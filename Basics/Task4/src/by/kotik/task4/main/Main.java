package by.kotik.task4.main;

import by.kotik.task4.logic.Train;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из 5 элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены
 * по времени отправления.  */

public class Main {
	public static void main(String[] args) {
	    Train[] trains = new Train[5];
	    trains[0] = new Train("Gomel", 123123, "12:00");
	    trains[1] = new Train("Brest", 131313, "09:00");
	    trains[2] = new Train("Minsk", 621325, "08:00");
	    trains[3] = new Train("Oslo", 152343, "05:00");
	    trains[4] = new Train("Amsterdam", 123457, "23:25");
	
	    Train.sortTrainNumber(trains);
	    System.out.println("Sorting train by number.");
	    for (Train train:trains) {
	        train.showTrain();
	    }
	
	    Train.sortDestination(trains);
	    System.out.println("\nSorting by destination.");
	    for (Train train:trains) {
	        train.showTrain();
	    }
	
	    System.out.println("\nShowing user number of train.");
	    int userNumber = 131313;
	    for (Train train:trains) {
	        if(train.showUserTrain(userNumber)) {
	            train.showTrain();
	        }
	    }
	}
}
