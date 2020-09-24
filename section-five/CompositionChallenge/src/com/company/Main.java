package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "Blue");

        Bed bed = new Bed("King",3,2,1,1);

        Lamp lamp = new Lamp("Modern", false, 75);

        Bedroom bedroom = new Bedroom("Frank's Room", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();

    }
}