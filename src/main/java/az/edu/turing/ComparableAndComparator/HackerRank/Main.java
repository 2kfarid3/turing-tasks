package az.edu.turing.ComparableAndComparator.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Player player1 = new Player( "amy", 100);
        Player player2 = new Player("david ", 100);
        Player player3 = new Player("heraldo  ", 50);
        Player player4 = new Player("aakansha ", 75);
        Player player5 = new Player("aleksa", 150);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        Checker playerComparator = new Checker();

        System.out.println("Before Sorting : " + players);
        Collections.sort(players, playerComparator);
        System.out.println("After Sorting : " + players);
    }
}
