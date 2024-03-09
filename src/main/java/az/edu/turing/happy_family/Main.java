package az.edu.turing.happy_family;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Angela", "Joana", 1983);
        Human father = new Human("Jack", "Joana", 1979);
        String[][] nonWorkingActivities = {{"Monday", "Football"}, {"Tuesday", "Basketball"}};
        Pet pet = new Pet("Dog", "Nora", 3, 20, new String[]{"walking"});
        Family family1 = new Family(mother, father, new Human[]{}, pet);
        Human child = new Human("Noah", "Vorano", 2000, 100, nonWorkingActivities, family1);
        family1.addChild(child);
        System.out.println(child);
    }
}
