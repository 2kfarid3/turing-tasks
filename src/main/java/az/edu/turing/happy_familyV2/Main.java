package az.edu.turing.happy_familyV2;

public class Main {
    public static void main(String[] args) {
        String[] petHabits = {"eat","drink","sleep"};
        Pet pet = new Pet("dog", "Rock", 5, 75, petHabits);

        Human mother = new Human("Jane","Karleone",1983);
        Human father = new Human("Vito","Karleone",1979);

        String[][] schedule = new String[2][2];
        schedule[0][0] = "Monday"; schedule[0][1] = "gym";
        schedule[1][0] = "Friday"; schedule[1][1] = "swimming";
        Human child = new Human("Michael", "Karleone", 1977, 90,pet,mother,father,schedule);

        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();
        child.feedPet(false);

        System.out.println(child);
    }
}