package com.company;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Frank";
        System.out.println("Static initialization called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("Second initialization block called");

    }

    public void someMethod() {
        System.out.println("Method called");
    }
}
