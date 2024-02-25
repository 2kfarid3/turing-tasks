package happy_family;

public class Main {
    public static void main(String[] args) {
        // Create pet
        Pet pet1 = new Pet("Dog", "Buddy", 3, 5, new String[]{"Fetch", "Roll Over"});

        // Create parents
        Human mother = new Human("Jane", "Smith", 1975);
        Human father = new Human("John", "Smith", 1973);

        // Create child with pet and parents
        Human child = new Human("Michael", "Smith", 2005, 90, mother, father,
                new int[][]{{1, 2}, {3, 4}}, pet1);

        // Display data about the child
        System.out.println(mother);
        child.greetPet();
        child.describePet();
    }
}
