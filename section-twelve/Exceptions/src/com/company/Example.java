package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Division not performed; Shutting down");
        }

    }

    private static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            return x/y;
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("No suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Attempted to divide by 0");
//        }
    }


    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Integers ");
        while(true) {
            try{
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("Enter a valid Integer: ");
            }
        }
    }
}
