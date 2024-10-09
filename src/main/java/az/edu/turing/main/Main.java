package az.edu.turing.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 30; i++) {
            int key = random.nextInt(0,20);
            if (map.containsKey(key)) {
                int value = 1;
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}


