package by.kotik.task4.logic;

import by.kotik.task4.entity.Bank;
import by.kotik.task4.entity.Customer;

public class BankLogic {
	public static Customer findCustomer(Bank bank, int passportId) {
		for (Customer customer:bank.getCustomers()) {
			if (customer.getPassportId() == passportId) {
				return customer;
			}
		}
		
		return null;
	}
	
	public static void addCustomer(Bank bank, Customer customer) {
		bank.getCustomers().add(customer);
	}
}
