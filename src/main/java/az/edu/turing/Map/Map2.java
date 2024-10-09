package az.edu.turing.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Alice", 12345);
        phoneBook.put("Bob", 67890);
        phoneBook.put("Charlie", 111213);

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
