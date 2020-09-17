package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if(number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
