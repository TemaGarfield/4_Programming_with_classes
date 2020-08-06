package by.kotik.task8.main;

import by.kotik.task8.entity.Customer;
import by.kotik.task8.logic.CustomerLogic;

/*
 * 8. Создать класс Customer: id, фамилия, имя, отчество, адресс, номер кредитной карточки, номер банковского счета.
 * Найти и вывести: 
 * а) список покупателей в алфавитном порядке.
 * b) список покупателей, у которых  номер кредитной карточки находится в заданном интервале.*/

public class Main {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		
        customers[0] = new Customer(1, "Пупкин", "Василий", "Игоревич", 123123, 151515);
        customers[1] = new Customer(2, "Иванов", "Петр", "Петрович", 137813, 782134);
        customers[2] = new Customer(3, "Арзамат", "Павел", "Юриевич", 777777, 111011);
        
        CustomerLogic customerLogic = new CustomerLogic(customers);
        
        customerLogic.sort();
        
        customerLogic.show();
        System.out.println();
        customerLogic.interval(100, 666666);
	}

}
