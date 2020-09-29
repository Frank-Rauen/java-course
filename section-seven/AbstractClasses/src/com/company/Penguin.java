package com.company;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " uselessly flapping it's wings");
        System.out.println("Flightless Bird; Fantastic swimmer");
    }
}
