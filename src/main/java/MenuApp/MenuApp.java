package MenuApp;

import java.util.Scanner;

import static MenuApp.Calculator.*;

public class MenuApp {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please select one:");
            System.out.println("1. Addition");
            System.out.println("2. Primality check");
            System.out.println("3. Square root calculation");
            System.out.println("4. Factorial calculation");
            System.out.print("Enter your choice: ");
            Scanner in = new Scanner(System.in);
            final int choice;
            try {
                choice = in.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please input a valid number.");
                continue;
            }
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter first number: ");
                        Double num1;
                        try {
                            num1 = Double.parseDouble(in.next());
                        } catch (NumberFormatException e) {
                            System.out.println("First number is an invalid input! Please input a valid number.");
                            continue;
                        }

                        System.out.print("Enter second number: ");
                        Double num2;
                        try {
                            num2 = Double.parseDouble(in.next());
                        } catch (NumberFormatException e) {
                            System.out.println("Second number is an invalid input! Please input a valid number.");
                            continue;
                        }

                        Double result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.print("Enter your number: ");
                        Integer number;
                        try {
                            number = Integer.parseInt(in.next());
                            if (number < 1) {
                                System.out.println("Please enter a number greater than or equal to 2.");
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please input a valid positive integer number.");
                            continue;
                        }

                        if (number == 1) {
                            System.out.println("1 is not a prime number");
                            break;
                        }

                        Boolean resultOfIsPrime = isPrime(number);
                        if (!resultOfIsPrime) {
                            System.out.println(number + " " + "is not prime.");
                        } else {
                            System.out.println(number + " " + "is prime.");
                        }
                        break;
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.print("Enter your number: ");
                        Double sqrtNumber;
                        try {
                            sqrtNumber = Double.parseDouble(in.next());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please input a valid number.");
                            continue;
                        }

                        Double resultOfSqrt = sqrt(sqrtNumber);
                        System.out.println(resultOfSqrt);
                        break;
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.print("Enter your number: ");
                        Integer factnumber;
                        try {
                            factnumber = Integer.parseInt(in.next());
                            if (factnumber < 0) {
                                System.out.println("Invalid input! Please input a valid positive integer number.");
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please input a valid integer number.");
                            continue;
                        }

                        Integer resultOfFact = Math.toIntExact(fact(factnumber));
                        System.out.println(resultOfFact);
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
