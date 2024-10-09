package az.edu.turing.ComparableAndComparator;

import java.util.Arrays;

public class StudentApp {
    public static void mainV1(String[] args) {
        Student[] students = new Student[]{
                new Student(4, "Messi", 20),
                new Student(5, "Ronaldo", 100),
                new Student(3, "Nani", 70)
        };
            System.out.println(Arrays.toString(students));
            Arrays.sort(students);
            System.out.println(Arrays.toString(students));
        }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(4, "Messi", 20),
                new Student(5, "Ronaldo", 100),
                new Student(3, "Nani", 70)
        };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new StudentComparatorScoreAndName());
        System.out.println(Arrays.toString(students));
    }
    }

