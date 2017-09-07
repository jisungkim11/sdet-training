package oop;

public class BankAccountApp {

	public static void main (String [] args){
		//creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "123456";
		acc1.name = "John Kim";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "1751983";
		
		BankAccount acc3 = new BankAccount("Savings account", 500);
		acc3.accountNumber = "13542867";
		acc3.checkBalance();
		
		
		//demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "jk";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		
		
		
	}
	
}
