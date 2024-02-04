package az.edu.turing;

import java.util.Scanner;

public class FunctionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int b = in.nextInt();
        System.out.println(sum(a));
        System.out.println(sum(b));
    }

    public static double sum(double num) {
        return num + 2;
    }

    public static int sum(int num) {
        return num + 2;
    }
}
