package by.kotik.task10.main;

import java.util.ArrayList;

import by.kotik.task10.logic.AirlineLogic;

/*
 * 10. Создать класс Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) Список рейсов для заданного пункта назначения.
 * b) Список рейсов для заданного дня недели.
 * c) Список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Main {

	public static void main(String[] args) {
        AirlineLogic planes = new AirlineLogic(new ArrayList<>());

        planes.addPlane("Gomel", 666666, "Boeing 747", "12:00", "Wed");
        planes.addPlane("Minsk", 777777, "Boeing 767", "09:00", "Fri");
        planes.addPlane("Oslo", 555555, "Airbus A300", "23:00", "Mon");
        planes.addPlane("Berlin", 111111, "Airbus A310", "04:27", "Sun");
        planes.addPlane("Amsterdam", 444444, "Boeing 747", "12:05", "Fri");
        planes.addPlane("Chicago", 111111, "Airbus A310", "08:00", "Mon");

        planes.showDestination("Berlin");
        System.out.println();
        planes.showDay("Fri");
        System.out.println();
        planes.showDayAfterTime("Mon", "07:00");

	}

}
