package com.company;

public class Main {

    public static void main(String[] args) {
        SportsCar carrera = new SportsCar(48);
        carrera.steer(45);
        carrera.accelerate(55);
        carrera.accelerate(40);
        carrera.accelerate(-90);
    }
}
