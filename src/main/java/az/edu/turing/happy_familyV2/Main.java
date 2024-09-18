package az.edu.turing.happy_familyV2;

public class Main {
    public static void main(String[] args) {
        String[] petHabits = {"eat", "drink", "sleep"};
        Pet pet = new Pet(Species.DOG, "Rock", 5, 75, petHabits);

        Human mother = new Human("Jane", "Karleone", 1983);
        Human father = new Human("Vito", "Karleone", 1979);

        String[][] schedule = new String[2][2];
        schedule[0][0] = DayOfWeek.MONDAY.name();
        schedule[0][1] = "gym";
        schedule[1][0] = DayOfWeek.FRIDAY.name();
        schedule[1][1] = "swimming";
        Human child1 = new Human("Michael", "Karleone", 2004, 90, schedule);
        Human child2 = new Human("John", "Karleone", 2006, 90, schedule);

        Family family = new Family(mother, father);

        family.addChild(child1);
        family.addChild(child2);
        family.setPet(pet);

        family.deleteChild(child1);

        family.countFamily();

        System.out.println(family);
    }
}
