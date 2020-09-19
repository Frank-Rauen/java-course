package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6) {
            System.out.println("Value is " + count);
            count++;
        }

        for(int i = 1; i < 6; i++) {
            System.out.println("Value is " + i);
        }
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while(count != 6);

        int newCount = 0;
        int num = 4;
        int finalNum = 20;

        while(num <= finalNum) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            newCount++;
            if(newCount >= 5) {
                System.out.println("Even numbers found " + newCount);
                break;
            }

            System.out.println("Even Number " + num);
        }

    }

    public static boolean isEvenNumber(int number) {
        while(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
