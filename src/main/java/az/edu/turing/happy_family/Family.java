package az.edu.turing.happy_family;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    //public static int countFamily;
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public int findChild(Human child) {
        for (int i = 0; i < getChildren().length; i++) {
            if (getChildren()[i].equals(child)) {
                return i;
            }
        }
        return -1;
    }

    public int addChild(Human child) {
        //System.out.println("Child is added :)");
        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[newChildren.length - 1] = child;
        children = newChildren;
        return 2 + newChildren.length;
    }

    public boolean deleteChild(Human child) {
        int index = findChild(child);
        if (children.length == 0) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int newIndex = 0;
        for (int i = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[newIndex++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.println("I have an " + pet.getSpecies() + " in " + pet.getAge() +
                    " years old, he is very sly");
        } else {
            System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() +
                    " years old, he is almost not sly");
        }
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
