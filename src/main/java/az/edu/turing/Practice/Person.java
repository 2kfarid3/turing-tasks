package az.edu.turing.Practice;

import java.util.Objects;

public class Person {
    String name;
    int age;
    String passport;

    public Person(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public void drinkWater(){
        System.out.println("I'm drinking water.");
    }

    public void wakeUp(){
        System.out.println("I'm waking up.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                '}';
    }
}
