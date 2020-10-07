package com.company;

public class Main {

    public static void main(String[] args) {
	StaticTest static1 = new StaticTest("First Instance");
        System.out.println(static1.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest static2 = new StaticTest("Second Instance");
        System.out.println(static2.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest static3 = new StaticTest("Third Instance");
        System.out.println(static3.getName() + " is instance number " + StaticTest.getNumInstances());


    }
}
