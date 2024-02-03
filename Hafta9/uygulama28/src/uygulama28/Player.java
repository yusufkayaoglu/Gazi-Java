package uygulama28;

public class Player {
	 String name;
	    int age;
	    String position;
	    int matchesPlayed;

	    Player(String name, int age, String position, int matchesPlayed) {
	        this.name = name;
	        this.age = age;
	        this.position = position;
	        this.matchesPlayed = matchesPlayed;
	    }

	    void showPlayerInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Position: " + position);
	        System.out.println("Matches Played: " + matchesPlayed);
	    }
}
