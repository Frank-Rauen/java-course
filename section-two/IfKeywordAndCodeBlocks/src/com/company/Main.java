package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if(score == 5000) {
            System.out.println("Your score was less 5K");
        } else if(score >= 1000) {
			System.out.println("Less than 5K");
		}
	    else {
			System.out.println("Got here");
		}

	    if(gameOver) {
	    	int finalScore = score + (levelCompleted * bonus);
			System.out.println("Final Score was " + finalScore);
		}

	    if(gameOver) {
	    	score = 10000;
	    	levelCompleted = 8;
	    	bonus = 200;
	    	int finalScore = score + (levelCompleted * bonus);

			System.out.println("Final Score Is " + finalScore);
		}

    }
}
