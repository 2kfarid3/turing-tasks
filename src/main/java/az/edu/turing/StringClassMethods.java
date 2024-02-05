package az.edu.turing;

import java.util.Scanner;

public class StringClassMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        String result = getName(b);
        int result1 = getName1(b);
        System.out.println(result);
        System.out.println(result1);
    }

    public static String getName(String a){
        int atIndex = a.indexOf("@");
        if (atIndex != -1) {
            String result = a.substring(0, atIndex);
            return result;
        } else {
            System.out.println("Invalid input!");
            return null;
        }
    }

    public static int getName1(String a){
        return a.length();
    }
}

