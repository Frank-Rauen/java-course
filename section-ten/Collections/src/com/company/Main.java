package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Pepsi Center", 12,12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserved();
        if(theater.reserveSeat("A02")) {
            System.out.println("Pay for seat");
        } else {
            System.out.println("Seat previously reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing copy");
        printList(seatCopy);
        System.out.println("Printing all seats");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println(minSeat.getSeatNumber() + " is the min seat and the max seat is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
    }

    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for (int i =0; i<list.size() - 2; i++) {
            for(int j = i + 1; j<list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
