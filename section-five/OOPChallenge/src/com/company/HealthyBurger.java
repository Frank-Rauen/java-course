package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Amount;

    private String healthyExtra2Name;
    private double healthyExtra2Amount;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Amount = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Amount = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Amount;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Amount);
        }
        if(healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Amount;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Amount);
        }
        return hamburgerPrice;
    }
}
