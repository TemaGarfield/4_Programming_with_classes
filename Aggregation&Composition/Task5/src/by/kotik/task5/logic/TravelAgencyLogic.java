package by.kotik.task5.logic;

import java.util.Comparator;

import by.kotik.task5.entity.TravelAgency;
import by.kotik.task5.entity.Voucher;

public class TravelAgencyLogic {
	public static void addVoucher(TravelAgency ta, Voucher voucher) {
		ta.getVouchers().add(voucher);
	}
	
	public static String findByType(TravelAgency ta, String type) {
		String message = "";
		
		for (Voucher voucher:ta.getVouchers()) {
			if (voucher.getType().equals(type)) {
				message +=  VoucherLogic.generateVoucher(voucher) + "\n";
			}
		}
		
		if (message.equals("")) {
			message = "Sorry. We can't find this transport.";
		}
		
		return message;
	}
	
	public static String findByTransport(TravelAgency ta, String transport) {
		String message = "";
		
		for (Voucher voucher:ta.getVouchers()) {
			if (voucher.getTransport().equals(transport)) {
				message += VoucherLogic.generateVoucher(voucher) + "\n";
			}
		}
		
		if (message.equals("")) {
			message = "Sorry. We can't find this transport.";
		}
		
		return message;
	}
	
	public static String findByNutrition(TravelAgency ta, int nutrition) {
		String message = "";
		
		for (Voucher voucher:ta.getVouchers()) {
			if (voucher.getNutrition() == nutrition) {
				message += VoucherLogic.generateVoucher(voucher) + "\n";
			}
		}
		
		if (message.equals("")) {
			message = "Sorry. We can't find this transport.";
		}
		
		return message;
	}
	
	public static String findByDays(TravelAgency ta, int days) {
		String message = "";
		
		for (Voucher voucher:ta.getVouchers()) {
			if (voucher.getNumberOfDays() == days) {
				message += VoucherLogic.generateVoucher(voucher) + "\n";
			}
		}
		
		if (message.equals("")) {
			message = "Sorry. We can't find this transport.";
		}
		
		return message;
	}
	
	public static void sortByDays(TravelAgency ta) {
		ta.getVouchers().sort(Comparator.comparing(Voucher::getNumberOfDays));
	}
	
	public static void showAll(TravelAgency ta) {
		for (Voucher voucher:ta.getVouchers()) {
			System.out.println(VoucherLogic.generateVoucher(voucher));
		}
	}
}
