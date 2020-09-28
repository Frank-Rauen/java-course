package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Hawaii");
        addInOrder(placesToVisit, "Alabama");
        addInOrder(placesToVisit, "Wyoming");
        addInOrder(placesToVisit, "Oregon");
        addInOrder(placesToVisit, "Delaware");
        addInOrder(placesToVisit, "Indiana");
        addInOrder(placesToVisit, "Indiana");
        addInOrder(placesToVisit, "Colorado");

        printList(placesToVisit);
        visit(placesToVisit);

    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println(newCity + " already included as a destination in list");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities available");
        } else {
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = s.nextInt();
            s.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("End of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("You are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }

        }


        }

        private static void printMenu() {
            System.out.println("Available action: \npress");
            System.out.println("0 - to quit program \n" +
                    "1 - to go to the next city \n" +
                    "2 - to go to previous city \n" +
                    "3 - print menu options");
    }
}
