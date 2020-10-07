package com.company;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Pepsi Center", 12,12);
        if(theater.reserveSeat("H11")) {
            System.out.println("Pay for your reservation");
        } else {
            System.out.println("Seat is reserved");
        }
    }
}
