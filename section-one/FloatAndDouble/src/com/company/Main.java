package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Minimum Float Value = " + myMinFloatValue);
        System.out.println("Maximum Float Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Minimum Double Value = " + myMinDoubleValue);
        System.out.println("Maximum Double Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("My Integer Value = " + myIntValue);
        System.out.println("My Float Value = " +myFloatValue);
        System.out.println("My Double Value = " +myDoubleValue);

        double numInput = 185.37d;
        double pound = numInput;
        double kilo = pound * .45359237d;

        System.out.println(kilo);




    }
}
