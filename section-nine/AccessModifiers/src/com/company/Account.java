package com.company;

import java.util.ArrayList;

public class Account {
    private String name;
    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String name) {
        this.name = name;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("Amount Deposited: " + amount + " total balance is " + this.balance);
        } else {
            System.out.println("Negative sums, can't change balance, cannot deposit negative sums");
        }
    }

    public void withdrawal(int amount) {
        int withdrawal = -amount;
        if(withdrawal < 0 ) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println("Amount withdrawn " + amount + " balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Total balance is " + this.balance);
    }
}
