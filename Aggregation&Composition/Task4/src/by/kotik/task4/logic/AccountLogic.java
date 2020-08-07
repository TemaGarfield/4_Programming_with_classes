package by.kotik.task4.logic;

import by.kotik.task4.entity.Account;

public class AccountLogic {
	public static void block(Account acc) {
		acc.setActive(false);
	}
	
	public static void unlock (Account acc) {
		acc.setActive(true);
	}
	
	public static String showStatus(Account acc) {
		
		if (acc.isActive()) {
			return "Unlocked";
		}
		
		return "Locked";
	}
}
