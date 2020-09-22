package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount franksAccount = new BankAccount();
	    franksAccount.deposit(180);
	    franksAccount.withdrawal(100);
	    franksAccount.setAccountNumber(55555);
	    franksAccount.withdrawal(5);
	    franksAccount.deposit(5000);

	    BankAccount bobsAccount = new BankAccount(113131,
                                                    800.50,
                                                "Bob Smith",
                                                "bob@gmail.com",
                                                1234567890);

	    BankAccount stevesAccount = new BankAccount();
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(stevesAccount);

        BankAccount myAccount = new BankAccount("Frank", "frank@gmail.com", 11111);
		System.out.println(myAccount.getAccountNumber() + " " + myAccount.getPhoneNumber());

		VipCustomer tedVip =  new VipCustomer();
		System.out.println(tedVip.getEmail() + " " + tedVip.getName() + " " + tedVip.getCreditLimit());

		VipCustomer ajVip = new VipCustomer("Aj", 1000);
		System.out.println(ajVip.getName() + " " + ajVip.getCreditLimit() + " " + ajVip.getEmail());
    }
}
