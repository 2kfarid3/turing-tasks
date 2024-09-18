package az.edu.turing.happy_familyV2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
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

    public boolean addChild(Human child) {
        Human[] newChildrenArray = Arrays.copyOf(this.children, this.children.length + 1);
        newChildrenArray[newChildrenArray.length - 1] = child;
        this.children = newChildrenArray;
        System.out.println("Child successfully added!");
        return true;
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Child not found!");
            return false;
        }

        Human[] newChildrenArray = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildrenArray[j++] = children[i];
            }
        }

        this.children = newChildrenArray;
        System.out.println("Child successfully deleted!");
        return true;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    public int countFamily() {
        int count = 3;
        for (int i = 0; i < children.length; i++) {
            count++;
        }
        System.out.println("Count of family: " + count);
        return count;
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
