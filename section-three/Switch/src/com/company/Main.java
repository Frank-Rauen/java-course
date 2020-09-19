package com.company;

public class Main {

    public static void main(String[] args) {
	int switchValue =3;

	char charValue = 'D';

	switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        case 3: case 4: case 5:
            System.out.println("Number is a 3 or 4 or 5");
            System.out.println(switchValue);
            break;

        default:
            System.out.println("Value was not 1 or 2");
            break;
        }

    switch(charValue) {
        case 'A':
            System.out.println("Char is A");
            break;
        case 'B':
            System.out.println("Char is B");
            break;
        case 'C':
            System.out.println("Char is C");
            break;
        case 'D':
            System.out.println("Char is D");
            break;
        case 'E':
            System.out.println("Char is E");
            break;
        default:
            System.out.println("Char not found");
            break;
	    }
    }
}
