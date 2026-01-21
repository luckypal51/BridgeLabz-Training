package Question.GameZone;

public class Main {
	  public static void main(String[] args) {

	        Player[] leaderboard = {
	            new Player("Lucky", 1200),
	            new Player("Himesh", 750),
	            new Player("Chirag", 980),
	            new Player("Rajeev", 450),
	            new Player("Nageshwar", 1100)
	        };

	        quickSort(leaderboard, 0, leaderboard.length - 1);

	        System.out.println("GamerZone Leaderboard:");
	        for (Player p : leaderboard) {
	            System.out.println(p);
	        }
	    }
	 public static void quickSort(Player[] players, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(players, low, high);
	            quickSort(players, low, pivotIndex - 1);
	            quickSort(players, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(Player[] players, int low, int high) {
	        Player pivot = players[high]; 
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (players[j].score >= pivot.score) {
	                i++;
	                Player temp = players[i];
	                players[i] = players[j];
	                players[j] = temp;
	            }
	        }

	        Player temp = players[i + 1];
	        players[i + 1] = players[high];
	        players[high] = temp;

	        return i + 1;
	    }

	  
}
