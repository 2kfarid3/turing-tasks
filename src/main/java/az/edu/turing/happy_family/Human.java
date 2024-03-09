package az.edu.turing.happy_family;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iqLevel;
    private String[][] nonWorkingActivities;
    private Family family;

    // Constructors
    public Human() {}

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iqLevel,
                 String[][] nonWorkingActivities, Family family) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iqLevel = iqLevel;
        this.nonWorkingActivities = nonWorkingActivities;
       this.family = family;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public String[][] getNonWorkingActivities() {
        return nonWorkingActivities;
    }

    public void setNonWorkingActivities(String[][] nonWorkingActivities) {
        this.nonWorkingActivities = nonWorkingActivities;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void welcome() {
        System.out.println("Hello, " + name + " " + surname);
    }

    public void describe() {
        System.out.println("I am " + name + " " + surname + ", my IQ level is " + iqLevel);
    }

    public void feed() {
        System.out.println("I am feeding...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth && iqLevel == human.iqLevel && Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Arrays.deepEquals(nonWorkingActivities, human.nonWorkingActivities) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, dateOfBirth, iqLevel, family);
        result = 31 * result + Arrays.deepHashCode(nonWorkingActivities);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirth +
                ", iq=" + iqLevel +
                ", schedule=" + Arrays.deepToString(nonWorkingActivities) +
                '}';
    }
}
