package az.edu.turing;

import java.util.Scanner;

public class OopFirstLesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] informations = new String[3][4];
        informations[0] = new String[]{"Elvin", "Farid", "Osman", "Nurlan"};
        informations[1] = new String[]{"10", "90", "95", "50"};
        informations[2] = new String[]{"30", "18", "18", "24"};

        int max = Integer.parseInt(informations[1][0]);
        int indexOfMax = 0;
        for (int i = 1; i < informations[1].length; i++) {
            int currentScore = Integer.parseInt(informations[1][i]);
            if (currentScore > max) {
                max = currentScore;
                indexOfMax = i;
            }
        }
        System.out.println(informations[0][indexOfMax] + " " + max + " " + informations[2][indexOfMax]);
    }
}


