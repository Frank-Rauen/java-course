package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Fred", 200);
        System.out.println("New Score is " + newScore);
        calculateScore(200);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 10);
        calcFeetAndInchesToCentimeters(354);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Player Not Found. No Score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 11))) {
            System.out.println("Invalid Entry");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainder = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainder);
    }
}
