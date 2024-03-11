package az.edu.turing.main;

import java.util.Scanner;

public class ParseFromStringToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numberAsString1 = in.nextLine();
        String numberAsString2 = in.nextLine();
        int number1 = Integer.parseInt(numberAsString1);
        int number2 = Integer.parseInt(numberAsString2);
        System.out.println(number1 / number2);
    }
}


