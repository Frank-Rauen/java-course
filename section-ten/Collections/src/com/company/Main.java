package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Pepsi Center", 12, 12);

        if (theater.reserveSeat("A02")) {
            System.out.println("Pay for seat");
        } else {
            System.out.println("Seat previously reserved");
        }

        if (theater.reserveSeat("F09")) {
            System.out.println("Pay for seat");
        } else {
            System.out.println("Seat previously reserved");
        }

        if (theater.reserveSeat("F09")) {
            System.out.println("Pay for seat");
        } else {
            System.out.println("Seat previously reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));

        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);

    }


    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=================================================");
    }

}
