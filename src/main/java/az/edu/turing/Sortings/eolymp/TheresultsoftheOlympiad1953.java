package az.edu.turing.Sortings.eolymp;

import java.util.*;
public class TheresultsoftheOlympiad1953 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Participant> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int score = in.nextInt();
            list.add(new Participant(i + 1, score));
        }
        list.sort((a, b) -> {
            if (b.score == a.score) {
                return Integer.compare(a.number, b.number);
            }
            return Integer.compare(b.score, a.score);
        });
        list.forEach(p -> System.out.print(p.number + " "));
    }
    static class Participant {
        int number;
        int score;
        Participant(int number, int score) {
            this.number = number;
            this.score = score;
        }
    }
}
