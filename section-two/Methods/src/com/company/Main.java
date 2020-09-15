package com.company;


public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score " + highScore);

        calculateScore(true, 800, 5,100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Steve", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Eric", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tracy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Xian", highScorePosition);




    }

    public  static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " is in position " +
                highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int newScore) {
        if(newScore >= 1000) {
            return 1;
        } else if((newScore >= 500) && (newScore < 1000)) {
            return 2;
        } else if((newScore >= 100) && (newScore < 500)) {
            return 3;
        }
            return 4;
    }

    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus)
    {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

}
