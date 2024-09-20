package az.edu.turing.module01_games.ShipBattleGame.ship_battle_game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShipBattleGame {
    public static void main(String[] args) {
        int[] target = setTarget();

        System.out.println(Arrays.toString(target));

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
        int row = random.nextInt(5) + 1;
        int col = random.nextInt(5) + 1;
        return new int[]{row, col};
    }

    public static void findShip(char[][] myBoard, int[] target) {

        printBoard(myBoard);
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Your row: ");
            int userRow = in.nextInt();
            System.out.println("Your column: ");
            int userColumn = in.nextInt();

            if (userRow >= 1 && userRow <= 5 && userColumn >= 1 && userColumn <= 5) {

                if (target[0] == userRow && target[1] == userColumn) {
                    System.out.println("You won");
                    myBoard[userRow - 1][userColumn - 1] = 'X';
                    printBoard(myBoard);
                    break;
                } else {
                    System.out.println("Try again");
                    myBoard[userRow - 1][userColumn - 1] = '*';
                    printBoard(myBoard);
                }
            } else {
                System.out.println("Invalid input. Please enter values between 1 and 5.");
            }

            System.out.println("Do you want to drop a bomb? (y/n): ");
            char dropBomb = in.next().charAt(0);

            if (dropBomb == 'y') {

                System.out.println("Enter bomb row: ");
                int bombRow = in.nextInt();
                System.out.println("Enter bomb column: ");
                int bombColumn = in.nextInt();

                if (bombRow >= 1 && bombRow <= 5 && bombColumn >= 1 && bombColumn <= 5) {

                    if (target[0] == bombRow && target[1] == bombColumn) {
                        System.out.println("You've found X!");
                        myBoard[bombRow - 1][bombColumn - 1] = 'X';
                        printBoard(myBoard);
                        break;
                    } else {
                        myBoard[bombRow - 1][bombColumn - 1] = 'x';
                    }

                    if (bombColumn > 1) {
                        if (target[0] == bombRow && target[1] == bombColumn - 1) {
                            System.out.println("You've found X!");
                            myBoard[bombRow - 1][bombColumn - 2] = 'X';
                            printBoard(myBoard);
                            break;
                        } else {
                            myBoard[bombRow - 1][bombColumn - 2] = 'x';
                        }
                    } else {
                        if (target[0] == bombRow && target[1] == bombColumn + 2) {
                            System.out.println("You've found X!");
                            myBoard[bombRow - 1][bombColumn + 1] = 'X';
                            printBoard(myBoard);
                            break;
                        } else {
                            myBoard[bombRow - 1][bombColumn + 1] = 'x';
                        }
                    }

                    if (bombColumn < 5) {
                        if (target[0] == bombRow && target[1] == bombColumn + 1) {
                            System.out.println("You've found X!");
                            myBoard[bombRow - 1][bombColumn] = 'X';
                            printBoard(myBoard);
                            break;
                        } else {
                            myBoard[bombRow - 1][bombColumn] = 'x';
                        }
                    } else {
                        if (target[0] == bombRow && target[1] == bombColumn - 2) {
                            System.out.println("You've found X!");
                            myBoard[bombRow - 1][bombColumn - 3] = 'X';
                            printBoard(myBoard);
                            break;
                        } else {
                            myBoard[bombRow - 1][bombColumn - 3] = 'x';
                        }
                    }
                    printBoard(myBoard);
                } else {
                    System.out.println("Invalid bomb coordinates. Please enter values between 1 and 5.");
                }
            } else {
                System.out.println("Please enter values between 1 and 5.");
            }
        }
        in.close();
    }
}

