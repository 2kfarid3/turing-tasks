package az.edu.turing;

import java.util.Scanner;

public class StringClassMethods {
    public static void main(String[] args) {
        getStringWithoutEmail();
        printStringLength();
    }

    public static void getStringWithoutEmail(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int atIndex = a.indexOf("@");
        if (atIndex != -1) {
            String result = a.substring(0, atIndex);
            System.out.println(result);
        } else {
            System.out.println("Invalid input!");
        }
    }

    public static void printStringLength(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(a.length());
    }
}
