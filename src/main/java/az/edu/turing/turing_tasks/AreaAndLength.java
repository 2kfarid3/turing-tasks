package az.edu.turing.turing_tasks;

import java.util.Scanner;

public class AreaAndLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int P = 4 * a;
        int A = a * a;
        System.out.println("P:" + P);
        System.out.println("A:" + A);
        System.out.print("Write radius:" + " ");
        double r = in.nextInt();
        double L = 2 * Math.PI * r;
        double Ar = Math.PI * r * r;
        System.out.println("L:" + L);
        System.out.println("Area of circle:" + Ar);
    }
}
