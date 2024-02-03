package uygulama28;

public class FootballPlayer extends Player {
	int goalsScored;

    FootballPlayer(String name, int age, String position, int matchesPlayed, int goalsScored) {
        super(name, age, position, matchesPlayed);
        this.goalsScored = goalsScored;
    }

    @Override
    void showPlayerInfo() {
        super.showPlayerInfo();
        System.out.println("Goals Scored: " + goalsScored);
    }
}
