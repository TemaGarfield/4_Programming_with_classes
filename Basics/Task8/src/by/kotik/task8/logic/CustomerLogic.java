package by.kotik.task8.logic;

import java.util.Arrays;

import by.kotik.task8.entity.Customer;

public class CustomerLogic {
	private Customer[] customers;
	
	public CustomerLogic() {
		
	}
	
	public CustomerLogic(Customer[] customers) {
		this.customers = customers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomerLogic [customers=" + Arrays.toString(customers) + "]";
	}
	
	public void sort() {
		for (int i = 0; i < getCustomers().length; i++) {
			for (int j = getCustomers().length - 1; j > i; j--) {
				if (getCustomers()[i].getSurname().compareTo(getCustomers()[j].getSurname()) > 0) {
					Customer tmp = getCustomers()[i];
					getCustomers()[i] = getCustomers()[j];
					getCustomers()[j] = tmp;
				}
			}
		}
	}
	
	public void show() {
		for (Customer customer:getCustomers()) {
			System.out.println(customer);
		}
	}
	
	public void interval(int min, int max) {
		if (min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		for (Customer customer:getCustomers()) {
			if (customer.getCreditCardNumber() > min && customer.getCreditCardNumber() < max) {
				System.out.println(customer.toString());
			}
		}
	}
	
}
