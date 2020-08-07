package by.kotik.task5.logic;

import by.kotik.task5.entity.Voucher;

public class VoucherLogic {
	public static String generateVoucher(Voucher voucher) {
		return "Type: " + voucher.getType() + 
			   " Transport: " + voucher.getTransport() + 
			   " Nutrition: " + voucher.getNutrition() + 
			   " Number of days: " + voucher.getNumberOfDays();
	}
}
