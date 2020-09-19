package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000, 2));

        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        for(int i = 2; i < 9; i++) {
            System.out.println("Your interest on the $10,000 loan is " + calculateInterest(10000, i));
        }

        for(int i = 8; i > 1; i--) {
            System.out.println("Your interest on the $10,000 loan is " + calculateInterest(10000, i));

        }
        System.out.println(isPrime(6));
        int count = 0;
        for(int i = 1; i < 500; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting Loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
