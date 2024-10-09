package az.edu.turing.happy_familyV2.pets;

import az.edu.turing.happy_familyV2.enumm.Species;
import az.edu.turing.happy_familyV2.pet_methods.Eat;
import az.edu.turing.happy_familyV2.pet_methods.Foul;

import java.util.Objects;

public class Dog extends Pet implements Eat, Foul {
    private final Species species;

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
    }

    public Species getSpecies() {
        return species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return species == dog.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(species);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void foul() {
        System.out.println("Dog make a foul");
    }

    @Override
    public String toString() {
        return "{" +
                "species=" + species + super.toString() +
                '}';
    }
}
