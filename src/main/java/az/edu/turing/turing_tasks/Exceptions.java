package az.edu.turing.turing_tasks;

import java.util.Scanner;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter two integers (or type 'exit' to quit):");
//            String input1 = in.next();
//            if (input1.equalsIgnoreCase("exit")) {
//                break;
//            }
//            String input2 = in.next();
//            if (input2.equalsIgnoreCase("exit")) {
//                break;
//            }
//
//            try {
//                int a = Integer.parseInt(input1);
//                int b = Integer.parseInt(input2);
//                System.out.println("Result: " + (a / b));
//            } catch (ArithmeticException e) {
//                System.out.println("Cannot divide by zero. Please try again.");
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter valid integers.");
//            }
//        }
//        in.close();
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Do not worry!");
    }
}

