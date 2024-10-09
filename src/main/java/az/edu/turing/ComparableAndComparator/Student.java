package az.edu.turing.ComparableAndComparator;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private long id;
    private String name;
    private int score;

    public Student(long id, String name, int score) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("{id=%d, name='%s', score=%d}", id, name, score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    @Override
    public int compareTo(Student that) {
        return Long.compare(this.id, that.id);
    }
}
