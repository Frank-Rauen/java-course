package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Frank";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Health Remaining " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Health Remaining " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Frank", 200, "Sword");
		System.out.println("Initial Health is " + player.getHealth());

    }
}
