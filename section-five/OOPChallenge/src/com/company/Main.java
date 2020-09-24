package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",.27);
        hamburger.addHamburgerAddition2("Lettuce", .75);
        hamburger.addHamburgerAddition3("Provolone",1.27);
        System.out.println("Total Hamburger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 1.67);
        healthyBurger.addHealthAddition1("Avocado", 1.55);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();


    }
}
