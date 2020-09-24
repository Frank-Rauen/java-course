package com.company;

class Car {
    private int doors;
    private int cylinders;
    private int wheels;
    private String name;
    private boolean engine;

    public Car(int doors, int cylinders, String name) {
        this.doors = doors;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
        this.engine = true;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

}

class Porsche extends Car {
    public Porsche(int doors, int cylinders, String name) {
        super(doors, cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}

class Ferrari extends Car {
    public Ferrari(int doors, int cylinders, String name) {
        super(doors, cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ferrari -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ferrari -> brake()";
    }
}

class Ford extends Car {
    public Ford(int doors, int cylinders, String name) {
        super(doors, cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";

    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4,6,"Model T");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford(4,6,"F150");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Ferrari ferrari = new Ferrari(2,8,"Carrera");
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

    }
}
