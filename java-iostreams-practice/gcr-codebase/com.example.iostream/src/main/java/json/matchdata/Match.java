package json.matchdata;

import java.util.Map;

public class Match {
    public int match_id;
    public String team1;
    public String team2;
    public Map<String, Integer> score;
    public String winner;
    public String player_of_match;

    @Override
    public String toString() {
        return match_id + ", " + team1 + ", " + team2 + ", " + winner + ", " + player_of_match;
    }
}