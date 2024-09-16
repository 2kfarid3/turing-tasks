package az.edu.turing.happy_familyV2;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this(name, surname, year);
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, year, mother, father);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public void greetPet(){
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
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                '}';
    }
}
