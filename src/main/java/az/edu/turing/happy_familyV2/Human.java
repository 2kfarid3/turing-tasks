package az.edu.turing.happy_familyV2;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, family);
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    /*public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(){
        System.out.println("I have " + pet.getSpecies() + "is " + pet.getAge() + "years old.");
        if (pet.getTrickLevel() > 50){
            System.out.println("He is very sly.");
        } else {
            System.out.println("He is almost not sly.");
        }
    }

    public boolean feedPet(boolean timeIsUp){

        boolean feed = false;
        if (timeIsUp){
            System.out.println("I'll feed " + pet.getNickname());
            feed = true;
        } else {

            Random random = new Random();
            int check = random.nextInt(101);

            if (check < pet.getTrickLevel()){
                System.out.println("Hm..I'll feed " + pet.getNickname());
                feed = true;
            } else {
                System.out.println("Hm..I think " + pet.getNickname() + " is not hungry");
            }
        }
        return timeIsUp || feed;
    }*/

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
