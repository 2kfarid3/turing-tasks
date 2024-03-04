package az.edu.turing.happy_family;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iqLevel;
    private Pet pet;
    private Human mother;
    private Human father;
    private int[][] nonWorkingActivities;

    // Constructors
    public Human() {}

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iqLevel, Human mother, Human father,
                 int[][] nonWorkingActivities, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iqLevel = iqLevel;
        this.mother = mother;
        this.father = father;
        this.nonWorkingActivities = nonWorkingActivities;
        this.pet = pet;
    }

    // Methods
    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.println("I have an " + pet.getSpecies() + " in " + pet.getAge() +
                    " years old, he is very sly");
        } else {
            System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() +
                    " years old, he is almost not sly");
        }
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public int[][] getNonWorkingActivities() {
        return nonWorkingActivities;
    }

    public void setNonWorkingActivities(int[][] nonWorkingActivities) {
        this.nonWorkingActivities = nonWorkingActivities;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iqLevel=" + iqLevel +
                ", pet=" + pet +
                ", mother=" + mother.getName() +
                ", father=" + father.getName() +
                '}';
    }
}
