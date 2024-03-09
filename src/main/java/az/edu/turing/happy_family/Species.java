package az.edu.turing.happy_family;

public enum Species {
    DOG("Dog", new String[]{"walking", "barking", "fetching"}),
    CAT("Cat", new String[]{"purring", "scratching", "sleeping"}),
    BIRD("Bird", new String[]{"flying", "singing", "pecking"}),
    FISH("Fish", new String[]{"swimming", "feeding", "hiding"});

    private final String species;
    private final String[] habits;

    Species(String species, String[] habits) {
        this.species = species;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public String[] getHabits() {
        return habits;
    }

}
