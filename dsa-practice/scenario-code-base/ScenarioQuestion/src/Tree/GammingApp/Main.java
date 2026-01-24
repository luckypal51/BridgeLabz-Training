package Tree.GammingApp;

public class Main {
	 public static void main(String[] args) {

	        Leaderboard lb = new Leaderboard();

	        lb.addOrUpdatePlayer(1, "Lucky", 1200);
	        lb.addOrUpdatePlayer(2, "Himesh", 1500);
	        lb.addOrUpdatePlayer(3, "Rajeev", 1800);
	        lb.addOrUpdatePlayer(4, "Nageshwar", 900);

	        lb.showTopPlayers(10);

	        System.out.println("\nUpdate Scores:");
	        lb.addOrUpdatePlayer(2, "Arvind", 2000);

	        lb.showTopPlayers(10);

	        System.out.println("\n Remove Player:");
	        lb.removePlayer(3);

	        lb.showTopPlayers(10);
	    }
}
