package az.edu.turing.Map;

import java.util.HashMap;
import java.util.Scanner;

public class Mapp {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many people do you want to add?");
        int n = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            checkPairs(s, phoneBook);
        }
    }

    public static void checkPairs(String name, HashMap<String, Integer> phoneBook) {
        if (phoneBook.containsKey(name)) {
            System.out.println(name + " = " + phoneBook.get(name));
        } else {
            System.out.println("Not Found");
        }
    }
}
