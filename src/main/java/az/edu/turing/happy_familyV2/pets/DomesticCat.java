package az.edu.turing.happy_familyV2.pets;

import az.edu.turing.happy_familyV2.enumm.Species;
import az.edu.turing.happy_familyV2.pet_methods.Eat;
import az.edu.turing.happy_familyV2.pet_methods.Foul;

import java.util.Objects;

public class DomesticCat extends Pet implements Eat, Foul {

    private final Species species;

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.CAT;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void foul() {
        System.out.println("Cat make a foul");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomesticCat that)) return false;
        return species == that.species;
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
