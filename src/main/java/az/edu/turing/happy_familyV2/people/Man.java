package az.edu.turing.happy_familyV2.people;

public final class Man extends Human{

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public void fixCar() {
        System.out.println(getName() + " is fixing car");
    }

    @Override
    public void greetPet(){
        System.out.println("Hey buddy, let's go to walk");
    }
}
