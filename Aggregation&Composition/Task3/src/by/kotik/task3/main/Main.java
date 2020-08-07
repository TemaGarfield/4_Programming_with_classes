package by.kotik.task3.main;

import by.kotik.task3.entity.City;
import by.kotik.task3.entity.Region;
import by.kotik.task3.entity.State;

public class Main {

	public static void main(String[] args) {
        State belarus = new State("Belarus", new City("Minsk", 348.8));
        belarus.addRegion(new Region("Brestskaya obl.", 32_787, new City("Brest", 146.1)));
        belarus.addRegion(new Region("Mogilevskaya obl.", 29_068, new City("Mogilev", 118.5)));
        belarus.addRegion(new Region("Vitebskaya obl.", 40_051, new City("Vitebsk", 124.5)));
        belarus.addRegion(new Region("Gomelskaya obl.", 40_372, new City("Gomel", 139.8)));
        belarus.addRegion(new Region("Grodnenskaya obl.", 25_127, new City("Grodno", 142.1)));
        belarus.addRegion(new Region("Minskaya obl", 39_854, new City("Minsk" ,348.8)));
        belarus.showCapitals();
        belarus.showCapital();
        belarus.showRegionNumber();
        System.out.println(belarus.getStateArea());

	}

}
