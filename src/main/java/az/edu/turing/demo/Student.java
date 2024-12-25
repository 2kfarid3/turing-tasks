package az.edu.turing.demo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Integer> grades;

    public Student(String name, ArrayList<Integer> grade) {
        this.name = name;
        grades = new ArrayList<>(grade);
    }

    public void addGrade(int grade) {
        try {
            if (grade < 0) {
                throw new IllegalArgumentException("Invalid grade: " + grade + " Grade must be a positive number.");
            }
            grades.add(grade);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
