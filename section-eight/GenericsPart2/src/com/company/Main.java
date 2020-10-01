package com.company;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	SoccerPlayer pat = new SoccerPlayer("Pat");
	BaseballPlayer dave = new BaseballPlayer("Dave");

	Team<FootballPlayer> vikings = new Team<>("Minnesota Vikings");

	vikings.addPlayer(joe);

	System.out.println(vikings.numPlayers());

	Team<BaseballPlayer> baseballTeam = new Team<>("Colorado Rockies");
	baseballTeam.addPlayer(dave);

	Team<SoccerPlayer> brokenTeam = new Team<>("Tottenham Hotspur");
	brokenTeam.addPlayer(pat);

	Team<FootballPlayer> broncos = new Team<>("Denver Broncos");

	vikings.matchResult(broncos, 21,7);

		System.out.println("Rankings: ");
		System.out.println(broncos.getName() + ": " + broncos.ranking());
		System.out.println(vikings.getName() + ": " + vikings.ranking());

		System.out.println(broncos.compareTo(vikings));
		System.out.println(vikings.compareTo(broncos));


    }
}
