package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "Shark eats people, killed by alcoholics";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }
    public String plot() {
        return "Aliens Attack!";
    }
}

class Inception extends Movie {
    public Inception() {
        super("Inception");
    }
    public String plot() {
        return "Dream Heist";
    }
}

class DieHard extends Movie {
    public DieHard() {
        super("Die Hard");
    }
    public String plot() {
        return "John McClane kills Terrorists";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }
//    public String plot() {
//        return "Forgettable";
//    }
}


public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" +
                    "Plot : " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
      int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Inception();
            case 4:
                return new DieHard();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }
    }

}
