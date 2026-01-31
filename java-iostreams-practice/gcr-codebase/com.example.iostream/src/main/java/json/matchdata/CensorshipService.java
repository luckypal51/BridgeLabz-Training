package json.matchdata;

public class CensorshipService {

    public static String maskTeam(String team) {
        String[] parts = team.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return "***";
    }

    public static void censorMatch(Match match) {
        match.team1 = maskTeam(match.team1);
        match.team2 = maskTeam(match.team2);
        match.winner = maskTeam(match.winner);
        match.player_of_match = "REDACTED";
    }
}
