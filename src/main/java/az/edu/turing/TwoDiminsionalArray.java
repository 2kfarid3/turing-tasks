package az.edu.turing;

import java.util.Scanner;

public class TwoDiminsionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
