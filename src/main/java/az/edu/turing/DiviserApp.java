package az.edu.turing;

import java.util.Scanner;

public class DiviserApp {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                // Input
                System.out.println("Enter an integer:");
                int number = in.nextInt();

                // Find and print divisors using do-while loop
                System.out.println("Divisors of " + number + ":");

                int i = 1;
                do {
                    if (number % i == 0) {
                        System.out.print(i + " ");
                    }
                    i++;
                } while (i <= number/2);
            }
        }

