package az.edu.turing.happy_family;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("NonWorkingDay1: ");
        String day1 = in.nextLine();
        System.out.print("NonWorkingDay2: ");
        String day2 = in.nextLine();
        DaysOfTheWeek nonWorkingDay1 = DaysOfTheWeek.name(day1.toUpperCase());
        DaysOfTheWeek nonWorkingDay2 = DaysOfTheWeek.name(day2.toUpperCase());
        Human mother = new Human("Angela", "Joana", 1983);
        Human father = new Human("Jack", "Joana", 1979);
        String[][] nonWorkingActivities = {{nonWorkingDay1.name(), "Football"},
                {nonWorkingDay2.name(), "Basketball"}};
        Pet pet = new Pet(Species.DOG.getSpecies(), "Nora", 3, 20, Species.DOG.getHabits());
        Family family1 = new Family(mother, father, new Human[]{}, pet);
        Human child = new Human("Noah", "Vorano", 2000, 100, nonWorkingActivities, family1);
        family1.addChild(child);
        System.out.println(child);
    }
}
