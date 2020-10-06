package com.example.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player frank = new Player("Frank", 20, 10);
        System.out.println(frank.toString());
        saveObject(frank);

        frank.setHitPoints(30);
        System.out.println(frank);
        frank.setWeapon("Mjolnir");
        saveObject(frank);
//        loadObject(frank);
        System.out.println(frank);

        ISaveable shrieker = new Monster("Shrieker", 20,20);
        System.out.println("Strength = " + ((Monster)shrieker).getStrength());

        saveObject(shrieker);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n" +
                        "1 - Enter a String\n" +
                        "0 - to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter String Here: ");
                    String stringInput = s.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
