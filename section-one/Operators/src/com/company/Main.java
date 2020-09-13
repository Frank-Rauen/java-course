package com.company;

public class Main {

    public static void main(String[] args) {
        // Addition
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result was " + previousResult);

        // Subtraction
        result = result - 1; // 3 - 1 = 2

        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result was " + previousResult);

        // Multiplication
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // Division
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // Modulus Operator
        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2

        System.out.println("1 + 1 = " + result);

        // result = result - 1
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;

        if(isAlien == false) {
            System.out.println("It isn't an Alien");
            System.out.println("ALIEN!!!");
        }

        int topScore = 99;
        if(topScore < 100) {
            System.out.println("High Score!!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than Second Top Score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore < 50)) {
            System.out.println("Or Operator operating");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("Success!");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Should print");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("Was car is True");
        }

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double thirdNumber = (firstNumber + secondNumber) * 100.00d;
        double remainder = thirdNumber % 40.00d;

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);

        if(!isNoRemainder) {
            System.out.println("Have some remainder");
        }

    }
}
