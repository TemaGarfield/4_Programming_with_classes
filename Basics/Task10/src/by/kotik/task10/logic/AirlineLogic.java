package by.kotik.task10.logic;

import java.util.ArrayList;

import by.kotik.task10.entity.Airline;

public class AirlineLogic {
    ArrayList<Airline> planes;

    public AirlineLogic(ArrayList<Airline> planes) {
        this.planes = planes;
    }

    public void addPlane(String destination, int flightNumber, String type, String time, String day) {
        planes.add(new Airline(destination, flightNumber, type, time, day));
    }

    public void showDestination(String userDestination) {
        for (Airline plane:planes) {
            if (plane.getDestination().equals(userDestination)) {
                System.out.println(plane.toString());
            }
        }
    }

    public void showDay(String userDay) {
        for (Airline plane:planes) {
            if (plane.getDay().equals(userDay)) {
                System.out.println(plane.toString());
            }
        }
    }

    public void showDayAfterTime(String userDay, String userTime) {
        for (Airline plane:planes) {
            if (plane.getDay().equals(userDay)) {
                if (plane.getTime().compareTo(userTime) > 0) {
                    System.out.println(plane.toString());
                }
            }
        }
    }
}
