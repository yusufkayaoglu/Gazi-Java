package uygulama28;

import java.util.ArrayList;

public class Team {
	ArrayList<FootballPlayer> footballPlayers = new ArrayList<>();
    ArrayList<BasketballPlayer> basketballPlayers = new ArrayList<>();

    void addFootballPlayer(FootballPlayer footballPlayer) {
        footballPlayers.add(footballPlayer);
    }

    void addBasketballPlayer(BasketballPlayer basketballPlayer) {
        basketballPlayers.add(basketballPlayer);
    }
    void showTeam() {
        System.out.println("Football Players:");
        for (FootballPlayer footballPlayer : footballPlayers) {
            footballPlayer.showPlayerInfo();
            System.out.println();
        }

        System.out.println("Basketball Players:");
        for (BasketballPlayer basketballPlayer : basketballPlayers) {
            basketballPlayer.showPlayerInfo();
            System.out.println();
        }
    }
}
