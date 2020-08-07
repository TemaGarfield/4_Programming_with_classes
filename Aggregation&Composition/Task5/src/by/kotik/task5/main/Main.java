package by.kotik.task5.main;

import by.kotik.task5.entity.TravelAgency;
import by.kotik.task5.entity.Voucher;
import by.kotik.task5.logic.TravelAgencyLogic;

public class Main {

	public static void main(String[] args) {
		TravelAgency ta = new TravelAgency("Travel Agency");
		
		TravelAgencyLogic.addVoucher(ta, new Voucher("Rest", "Bus", 2, 30));
		TravelAgencyLogic.addVoucher(ta, new Voucher("Shopping", "Plane", 3, 15));
		TravelAgencyLogic.addVoucher(ta, new Voucher("Tour", "Train", 1, 7));
		TravelAgencyLogic.addVoucher(ta, new Voucher("Cruise", "Ship", 4, 60));
		TravelAgencyLogic.addVoucher(ta, new Voucher("Rest", "Plane", 1, 10));
		
		System.out.println(TravelAgencyLogic.findByDays(ta, 10));
		System.out.println();
		System.out.println(TravelAgencyLogic.findByNutrition(ta, 1));
		
		TravelAgencyLogic.showAll(ta);
		TravelAgencyLogic.sortByDays(ta);
		System.out.println();
		TravelAgencyLogic.showAll(ta);
		
		System.out.println();
		System.out.println(TravelAgencyLogic.findByTransport(ta, "Plane"));
		System.out.println();
		System.out.println(TravelAgencyLogic.findByType(ta, "Rest"));
	}

}
