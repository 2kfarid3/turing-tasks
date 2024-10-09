package az.edu.turing.happy_familyV2.people;

import az.edu.turing.happy_familyV2.pets.Pet;

public final class Women extends Human{

    public Women(String name, String surname, int year) {
        super(name, surname, year);
    }

    public void cookDinner() {
        System.out.println(getName() + " is cooking dinner");
    }

    @Override
    public void greetPet(){
        System.out.println("Hello my sweet ");
    }
}
