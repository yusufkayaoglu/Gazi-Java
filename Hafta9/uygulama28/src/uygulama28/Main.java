package uygulama28;

public class Main {

	public static void main(String[] args) {
		    FootballPlayer footballPlayer1 = new FootballPlayer("Cengiz Ünder", 24, "Forward", 40, 15);
	        FootballPlayer footballPlayer2 = new FootballPlayer("Hakan Çalhanoðlu", 28, "Midfield", 50, 10);
	        FootballPlayer footballPlayer3 = new FootballPlayer("Merih Demiral", 24, "Defense", 30, 5);
	        BasketballPlayer basketballPlayer1 = new BasketballPlayer("Cedi Osman", 26, "Forward", 55, 15);
	        BasketballPlayer basketballPlayer2 = new BasketballPlayer("Furkan Korkmaz", 24, "Guard", 60, 20);
	        BasketballPlayer basketballPlayer3 = new BasketballPlayer("Ersan Ýlyasova", 34, "Forward", 70, 10);


	        Team team = new Team();
	        team.addFootballPlayer(footballPlayer1);
	        team.addFootballPlayer(footballPlayer2);
	        team.addFootballPlayer(footballPlayer3);
	        team.addBasketballPlayer(basketballPlayer1);
	        team.addBasketballPlayer(basketballPlayer2);
	        team.addBasketballPlayer(basketballPlayer3);
	        team.showTeam();

	}

}
