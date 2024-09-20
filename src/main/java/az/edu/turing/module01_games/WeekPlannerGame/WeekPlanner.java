package az.edu.turing.module01_games.WeekPlannerGame;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday"; schedule[0][1] = "do home work";
        schedule[1][0] = "Monday"; schedule[1][1] = "go to course; watch a film";
        schedule[2][0] = "Tuesday"; schedule[2][1] = "go to gym and english-course";
        schedule[3][0] = "Wednesday"; schedule[3][1] = "do home work and read a book";
        schedule[4][0] = "Thursday"; schedule[4][1] = "go to gym and english-course";
        schedule[5][0] = "Friday"; schedule[5][1] = "go to course and sleep at course";
        schedule[6][0] = "Saturday"; schedule[6][1] = "go to gym and english-course";

        while (true){
            System.out.println("Please, input the day of the week:");
            String day = in.nextLine();

            boolean found = false;
            for (int j = 0; j < schedule.length; j++) {
                if (day.equalsIgnoreCase("change " + schedule[j][0])){
                    System.out.println("Please, input new tasks for " + schedule[j][0]);
                    String task = in.nextLine();
                    schedule[j][1] = task;
                    found = true;
                    break;
                }
            }

            if (day.equalsIgnoreCase("exit")) {
                break;
            }

            for (int i = 0; i < schedule.length; i++) {
                if (day.equalsIgnoreCase(schedule[i][0]) || day.equalsIgnoreCase(schedule[i][0] + " ")) {
                    System.out.println(schedule[i][1]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
