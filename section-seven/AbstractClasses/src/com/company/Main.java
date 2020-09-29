package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Terrier");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
