package az.edu.turing.ship_battle_game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShipBattleGame {
    public static void main(String[] args) {
        int[] target = setTarget();
        //System.out.println(Arrays.toString(target));
        char[][] myBoard = initializeBoard();
        findShip(myBoard, target);
    }

    public static char[][] initializeBoard() {
        char[][] myBoard = new char[5][5];
        for (int i = 0; i < myBoard.length; i++) {
            for (int j = 0; j < myBoard[i].length; j++) {
                myBoard[i][j] = '-';
            }
        }
        return myBoard;
    }

    public static void printBoard(char[][] myBoard) {
        System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " |");
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + myBoard[i][j] + " |");
            }
            System.out.println();
        }
    }

    public static int[] setTarget() {
        Random random = new Random();
        int row = random.nextInt(1, 6);
        int col = random.nextInt(1, 6);
        int[] target = {row, col};
        return target;
    }

    public static void findShip(char[][] myBoard, int[] target) {
        printBoard(myBoard);
        Scanner in = new Scanner(System.in);
        System.out.println("Your row: ");
        int userRow = in.nextInt();
        System.out.println("Your column: ");
        int userColumn = in.nextInt();
        while (true) {
            if (target[0] == userRow && target[1] == userColumn) {
                System.out.println("You won");
                myBoard[userRow - 1][userColumn - 1] = 'X';
                printBoard(myBoard);
                break;
            } else {
                System.out.println("Try again");
                myBoard[userRow - 1][userColumn - 1] = '*';
                printBoard(myBoard);
                System.out.println("Your row: ");
                userRow = in.nextInt();
                System.out.println("Your column: ");
                userColumn = in.nextInt();
            }
        }
    }
}
