package Tree.GammingApp;
import java.util.*;

class Leaderboard {

    private Map<Integer, Player> map = new HashMap<>();

    private TreeSet<Player> leaderboard = new TreeSet<>(
        (a, b) -> {
            if (a.score != b.score) return b.score - a.score;
            return a.id - b.id;
        }
    );

 
    public void addOrUpdatePlayer(int id, String name, int score) {
        if (map.containsKey(id)) {
            Player old = map.get(id);
            leaderboard.remove(old); 
            old.score = score;       
            old.name = name;
            leaderboard.add(old);   
        } else {
            Player p = new Player(id, name, score);
            map.put(id, p);
            leaderboard.add(p);
        }
    }

  
    public void showTopPlayers(int k) {
        System.out.println(" Top " + k + " Players:");
        int count = 0;
        for (Player p : leaderboard) {
            System.out.println(++count + ". " + p);
            if (count == k) break;
        }
    }

    public void removePlayer(int id) {
        Player p = map.remove(id);
        if (p != null) {
            leaderboard.remove(p);
            System.out.println(" Player removed: " + p.name);
        } else {
            System.out.println(" Player not found!");
        }
    }
}
