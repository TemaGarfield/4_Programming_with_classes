package by.kotik.task4.logic;

import java.util.Comparator;

import by.kotik.task4.entity.Account;
import by.kotik.task4.entity.Customer;

public class CustomerLogic {
	public static void openAcc(Customer customer, Account acc) {
		customer.getAccounts().add(acc);
	}
	
	public static double getBalance (Customer customer) {
		double balance = 0;
		for (Account acc:customer.getAccounts()) {
			balance += acc.getBalance();
		}
		
		return balance;
	}
	
	public static double getPositiveBalance(Customer customer) {
		double balance = 0;
		
		for (Account acc:customer.getAccounts()) {
			if (acc.getBalance() > 0) {
				balance += acc.getBalance();
			}
		}
		
		return balance;
	}
	
	public static double getNegativeBalance(Customer customer) {
		double balance = 0;
		
		for (Account acc:customer.getAccounts()) {
			if (acc.getBalance() < 0) {
				balance += acc.getBalance();
			}
		}
		
		return balance;
	}
	
	public static void sortByBalance(Customer customer) {
		customer.getAccounts().sort(Comparator.comparing(Account::getBalance));
	}
	
	public static Account findAccount(Customer customer, int id) {
		for (Account acc:customer.getAccounts()) {
			if (acc.getId() == id) {
				return acc;
			}
		}
		
		return null;
	}
	
	public static void showInfo(Customer customer) {
		for (Account acc:customer.getAccounts()) {
			System.out.println("id: " + acc.getId() + " balance: " + acc.getBalance() + " status: " + AccountLogic.showStatus(acc));
		}
	}
}
