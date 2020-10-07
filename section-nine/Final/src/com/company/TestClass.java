package com.company;

public class TestClass {

    private static int classCounter = 0;
    public final String name;
    public final int instanceNumber;

    public TestClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance number " +instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }


}
