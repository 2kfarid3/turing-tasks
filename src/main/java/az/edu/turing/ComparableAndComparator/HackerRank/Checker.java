package az.edu.turing.ComparableAndComparator.HackerRank;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        int scoreComparison = Integer.compare(secondPlayer.getScore(), firstPlayer.getScore());

        if (scoreComparison == 0) {
            return firstPlayer.getName().compareTo(secondPlayer.getName());
        }

        return scoreComparison;
    }
}
