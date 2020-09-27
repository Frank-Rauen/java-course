package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static CellPhone cellPhone = new CellPhone("1-800-555-5555");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\n Enter Action: (6 to show all available actions)");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    cellPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact: ");
        String name = s.nextLine();
        System.out.println("Enter Number: ");
        String phone = s.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(cellPhone.addNewContact(newContact)) {
            System.out.println("New Contact added " + name + " phone number is " + phone);
        } else {
            System.out.println("Cannot add contact. " + name + " already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact: ");
        String name = s.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = s.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = s.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(cellPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Record Updated");
        } else {
            System.out.println("Error updating Record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact: ");
        String name = s.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(cellPhone.removeContact(existingContactRecord)) {
            System.out.println("Delete successful");
        } else {
            System.out.println("Error deleting contact");
        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact: ");
        String name = s.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

        if(cellPhone.removeContact(existingContactRecord)) {
            System.out.println("Delete successful");
        } else {
            System.out.println("Error deleting contact");
        }

    }

    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable action: \n press");
        System.out.println("0 - to Exit \n" +
                            "1 - to print all contacts \n" +
                            "2 - to add contact \n" +
                            "3 - to update an existing contact" +
                            "4 - to remove an existing contact \n" +
                            "5 - query if existing contact exists \n" +
                            "6 - print list of available actions.");
        System.out.println("Choose your action: ");
    }
}
