package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        Team<FootballPlayer> broncos = new Team<>("Denver Broncos");
        Team<FootballPlayer> patriots = new Team<>("New England Patriots");
        Team<FootballPlayer> jets = new Team<>("NY Jets");
        Team<FootballPlayer> giants = new Team<>("Ny Giants");

        footballLeague.add(broncos);
        footballLeague.add(patriots);
        footballLeague.add(jets);
        footballLeague.add(giants);

        





    }
}
