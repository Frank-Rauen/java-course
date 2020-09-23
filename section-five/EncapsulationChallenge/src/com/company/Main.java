package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50,false);

	printer.addToner(25);
	printer.printPages(5);
	printer.isDuplex();
    }
}
