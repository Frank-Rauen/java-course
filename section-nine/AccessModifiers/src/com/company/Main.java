package com.company;

public class Main {

    public static void main(String[] args) {
	    Account account = new Account("Frank");
	    account.deposit(5000);
	    account.withdrawal(345);
	    account.withdrawal(500);
	    account.calculateBalance();

		System.out.println("Franks total balance is " + account.getBalance());

	}
}
