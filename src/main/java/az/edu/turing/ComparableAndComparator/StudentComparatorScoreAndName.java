package az.edu.turing.ComparableAndComparator;

import java.util.Comparator;

public class StudentComparatorScoreAndName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getScore() > student1.getScore() ? 1
                : student2.getScore() < student2.getScore() ? -1
                : student1.getName().compareTo(student2.getName()) != 0
                ? student1.getName().compareTo(student2.getName())
                : -Long.compare(student1.getId(), student2.getId());
    }
}
