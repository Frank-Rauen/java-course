package com.company;

public class Main {

    public static void main(String[] args) {
        //checkNumber Challenge
        checkNumber(1);
        checkNumber(-55);
        checkNumber(0);

        //toMilesPerHour Challenge

        printConversion(85);

        // MegaBytes challenge

        printMegaBytesAndKiloBytes(2500);

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

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        long milesPerHour = Math.round(kilometersPerHour/1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if((hourOfDay < 8) || (hourOfDay > 23) && barking) {
            return true;
        } else if((hourOfDay > 8) || (hourOfDay < 23) && !barking) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }else if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0 )) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        int convertedFirstNumber = (int) (firstNumber * 1000);

        int convertedSecondNumber = (int) (secondNumber * 1000);

        return convertedFirstNumber == convertedSecondNumber;

    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int sum) {
        if(firstNum + secondNum == sum) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
        if((firstNum >= 13 && firstNum <= 19) || (secondNum >= 13 && secondNum <= 19) || (thirdNum >= 13 && thirdNum <= 19)) {
            return true;
        }
        return false;
    }
}
