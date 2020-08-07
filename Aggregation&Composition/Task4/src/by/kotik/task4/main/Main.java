package by.kotik.task4.main;

import by.kotik.task4.entity.Account;
import by.kotik.task4.entity.Bank;
import by.kotik.task4.entity.Customer;
import by.kotik.task4.logic.AccountLogic;
import by.kotik.task4.logic.BankLogic;
import by.kotik.task4.logic.CustomerLogic;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Belarusbank");
		
        Customer ivanov = new Customer("Ivan", "Ivanov", 123123);
        Customer pupkin = new Customer("Vasiliy", "Pupkin", 555555);
        
        BankLogic.addCustomer(bank, ivanov);
        BankLogic.addCustomer(bank, pupkin);
        
        
        CustomerLogic.openAcc(ivanov, new Account(20.5));
        CustomerLogic.openAcc(ivanov, new Account(-50.6));
        CustomerLogic.openAcc(ivanov, new Account(70.3));
        CustomerLogic.openAcc(ivanov, new Account(-74.5));
        CustomerLogic.openAcc(ivanov, new Account(-172.70));
        
        CustomerLogic.openAcc(pupkin, new Account(1000.4));
        CustomerLogic.openAcc(pupkin, new Account(-750.3));
        CustomerLogic.openAcc(pupkin, new Account(1573.89));
        CustomerLogic.openAcc(pupkin, new Account(40.1));
        CustomerLogic.openAcc(pupkin, new Account(-561.2));
        
        System.out.println(AccountLogic.showStatus(CustomerLogic.findAccount(BankLogic.findCustomer(bank, 123123), 3)));
        AccountLogic.block(CustomerLogic.findAccount(BankLogic.findCustomer(bank, 123123), 3));
        System.out.println(AccountLogic.showStatus(CustomerLogic.findAccount(BankLogic.findCustomer(bank, 123123), 3)));
        
        CustomerLogic.showInfo(BankLogic.findCustomer(bank, 123123));
        System.out.println();
        CustomerLogic.sortByBalance(BankLogic.findCustomer(bank, 123123));
        CustomerLogic.showInfo(BankLogic.findCustomer(bank, 123123));
        System.out.println();
        
        System.out.println("Negative balance: " + CustomerLogic.getNegativeBalance(BankLogic.findCustomer(bank, 123123)));
        System.out.println("Positive balance: " + CustomerLogic.getPositiveBalance(BankLogic.findCustomer(bank, 123123)));
        System.out.println("Balance: " + CustomerLogic.getBalance(BankLogic.findCustomer(bank, 123123)));
        
	}

}
