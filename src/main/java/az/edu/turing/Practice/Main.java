package az.edu.turing.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      String s1 = "Elvin";
      String s2 = s1;
      System.out.println(s1 == s2);
      System.out.println(s1.equals(s2));

      s2 = "Farid";

      System.out.println(s2);
      System.out.println(s1);

      System.out.println(s1 == s2);
      System.out.println(s1.equals(s2));
    }
}
