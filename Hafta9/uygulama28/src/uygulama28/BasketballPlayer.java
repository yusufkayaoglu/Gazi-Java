package uygulama28;

public class BasketballPlayer extends Player {
	int rebounds;

    BasketballPlayer(String name, int age, String position, int matchesPlayed, int rebounds) {
        super(name, age, position, matchesPlayed);
        this.rebounds = rebounds;
    }

    @Override
    void showPlayerInfo() {
        super.showPlayerInfo();
        System.out.println("Rebounds: " + rebounds);
    }
}
