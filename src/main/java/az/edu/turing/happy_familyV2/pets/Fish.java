package az.edu.turing.happy_familyV2.pets;

import az.edu.turing.happy_familyV2.enumm.Species;
import az.edu.turing.happy_familyV2.pet_methods.Eat;

import java.util.Objects;

public class Fish extends Pet implements Eat {

    private final Species species;

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish fish)) return false;
        return species == fish.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(species);
    }

    @Override
    public String toString() {
        return "{" +
                "species=" + species + super.toString() +
                '}';
    }
}
