package com.company;

public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        numInstances++;
        this.name = name;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
