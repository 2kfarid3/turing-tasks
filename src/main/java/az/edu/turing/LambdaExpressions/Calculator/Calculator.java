package az.edu.turing.LambdaExpressions.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import static az.edu.turing.LambdaExpressions.Calculator.Actions.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        Double num1;
        while (true) {
            try {
                num1 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        System.out.println("Enter the second number:");
        Double num2;
        while (true) {
            try {
                num2 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        System.out.println("Choose an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int operation = scanner.nextInt();
        Double result = null;

        switch (operation) {
            case 1:
                result = addDouble.apply(num1, num2);
                break;
            case 2:
                result = minusDouble.apply(num1, num2);
                break;
            case 3:
                result = multiplyDouble.apply(num1, num2);
                break;
            case 4:
                result = divisionDouble.apply(num1, num2);
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        if (result != null) {
            System.out.println("Result: " + result);
        }
    }
}
