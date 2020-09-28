package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("1stBank");

        bank.addBranch("Golden");

        bank.addCustomer("Golden", "Frank", 254.67);
        bank.addCustomer("Golden", "Steve", 698.16);
        bank.addCustomer("Golden", "Trevor", 100.23);

        bank.addBranch("Denver");
        bank.addCustomer("Denver", "Terrence", 150.54);

        bank.addCustomerTransaction("Golden", "Frank", 44.22);
        bank.addCustomerTransaction("Golden", "Frank", 144.22);
        bank.addCustomerTransaction("Golden", "Frank", 5.22);
        bank.addCustomerTransaction("Golden", "Trevor", 44.22);

        bank.listCustomers("Golden", true);
        bank.listCustomers("Denver", true);

        bank.addBranch("Okinawa");

        if(!bank.addCustomer("Okinawa", "Kerry", 1.02)) {
            System.out.println("Branch doesn't exist");
        }

        if(!bank.addBranch("Golden")) {
            System.out.println("That branch already exists");
        }

        if(!bank.addCustomerTransaction("Golden", "Bart", 5.00)) {
            System.out.println("No such customer at listed branch");
        }

        if(!bank.addCustomer("Golden", "Frank", 13.13)) {
            System.out.println("Customer already exists at branch");
        }


    }
}
