package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void addToner(int toner) {
        int totalToner = this.tonerLevel + toner;
        if(totalToner > 100) {
            System.out.println("Toner Overflowing");
        } else if(totalToner <= 0){
            System.out.println("Toner Empty");
        } else {
            System.out.println("Toner filled to " + totalToner);
        }
    }

    public void printPages(int pages) {
       int totalPages = this.pagesPrinted + pages;
        System.out.println("Total Pages printed is " + totalPages);

    }

    public void isDuplex() {
        if(this.duplex == true) {
            System.out.println("Duplex Printer");
        } else {
            System.out.println("Not a Duplex Printer");
        }
    }
}
