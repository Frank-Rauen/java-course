package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while(true) {
            System.out.println("Enter Number: ");
            boolean isAnInt =  scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                
                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + " max = " + max);
        scanner.close();
    }
}
