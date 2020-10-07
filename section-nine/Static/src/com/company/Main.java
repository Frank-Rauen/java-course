package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
	StaticTest static1 = new StaticTest("First Instance");
        System.out.println(static1.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest static2 = new StaticTest("Second Instance");
        System.out.println(static2.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest static3 = new StaticTest("Third Instance");
        System.out.println(static3.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println(multiplier);
        System.out.println(answer);


    }

    public static int multiply(int num) {
        return num * multiplier;
    }

}
