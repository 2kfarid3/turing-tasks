package az.edu.turing.happy_familyV2.pets;

import az.edu.turing.happy_familyV2.enumm.Species;
import az.edu.turing.happy_familyV2.pet_methods.Response;

import java.util.Objects;

public class RoboCat extends Pet implements Response {

    private final Species species;

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.ROBOCAT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoboCat roboCat)) return false;
        return species == roboCat.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(species);
    }

    @Override
    public void response() {
        System.out.println("I response you");
    }

    @Override
    public String toString() {
        return "{" +
                "species=" + species + super.toString() +
                '}';
    }
}
