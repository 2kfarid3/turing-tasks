package happy_familyV2;

import az.edu.turing.happy_familyV2.Family;
import az.edu.turing.happy_familyV2.Human;
import az.edu.turing.happy_familyV2.Pet;
import az.edu.turing.happy_familyV2.Species;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    private Family family;
    private Human mother;
    private Human father;
    private Human child1;
    private Human child2;
    private Pet pet;

    @BeforeEach
    void setUp() {
        mother = new Human("Jane", "Karleone", 1983);
        father = new Human("Vito", "Karleone", 1979);
        family = new Family(mother, father);
        child1 = new Human("Michael", "Karleone", 2004, 90, new String[][]{{"MONDAY", "gym"}, {"FRIDAY", "swimming"}});
        child2 = new Human("John", "Karleone", 2006, 90, new String[][]{{"MONDAY", "gym"}, {"FRIDAY", "swimming"}});
        pet = new Pet(Species.DOG, "Rock", 5, 75, new String[]{"eat, drink, sleep]"});
        family.setPet(pet);
    }

    @Test
    void testAddChild() {
        assertTrue(family.addChild(child1), "Added child was fail!");
        assertEquals(1, family.getChildren().length, "Count of child differ from expected!");
        assertEquals(child1, family.getChildren()[0], "Added child is false!");
    }

    @Test
    void testDeleteChildByObjectSuccess() {
        family.addChild(child1);
        family.addChild(child2);
        assertTrue(family.deleteChild(child1), "Deleted child was fail!");
        assertEquals(1, family.getChildren().length, "Count of child differ from expected!");
        assertEquals(child2, family.getChildren()[0], "Right child is not deleted!");
    }

    @Test
    void testDeleteChildByObjectFailure() {
        family.addChild(child2);
        assertFalse(family.deleteChild(child1), "Right child was deleted!");
        assertEquals(1, family.getChildren().length, "Count of child differ from expected!");
    }

    @Test
    void testCountFamily() {
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(pet);
        assertEquals(5, family.countFamily(), "Count of family members is false!");
    }

    @Test
    void testToStringFamily(){
        String expected = "Family{mother=Human{name='Jane', surname='Karleone', year=1983, iq=0, schedule=null}, father=Human{name='Vito', surname='Karleone', year=1979, iq=0, schedule=null}, children=[Human{name='John', surname='Karleone', year=2006, iq=90, schedule=[[MONDAY, gym], [FRIDAY, swimming]]}], pet=DOG{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}";

        String result = "Family{mother=Human{name='Jane', surname='Karleone', year=1983, iq=0, schedule=null}, father=Human{name='Vito', surname='Karleone', year=1979, iq=0, schedule=null}, children=[Human{name='John', surname='Karleone', year=2006, iq=90, schedule=[[MONDAY, gym], [FRIDAY, swimming]]}], pet=DOG{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}";

        assertEquals(expected,result);
    }
}
