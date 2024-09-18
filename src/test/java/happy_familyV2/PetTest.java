package happy_familyV2;


import az.edu.turing.happy_familyV2.Pet;
import az.edu.turing.happy_familyV2.Species;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Pet pet;
    private String[] habits;

    @BeforeEach
    void setUp() {
        habits = new String[]{"eat", "sleep", "play"};
        pet = new Pet(Species.CAT, "Whiskers", 3, 75, habits);
    }

    @Test
    void testGetSpecies() {
        assertEquals(Species.CAT, pet.getSpecies());
    }

    @Test
    void testSetSpecies() {
        pet.setSpecies(Species.DOG);
        assertEquals(Species.DOG, pet.getSpecies());
    }

    @Test
    void testGetNickname() {
        assertEquals("Whiskers", pet.getNickname());
    }

    @Test
    void testSetNickname() {
        pet.setNickname("Rex");
        assertEquals("Rex", pet.getNickname());
    }

    @Test
    void testGetAge() {
        assertEquals(3, pet.getAge());
    }

    @Test
    void testSetAge() {
        pet.setAge(4);
        assertEquals(4, pet.getAge());
    }

    @Test
    void testGetTrickLevel() {
        assertEquals(75, pet.getTrickLevel());
    }

    @Test
    void testSetTrickLevel() {
        pet.setTrickLevel(80);
        assertEquals(80, pet.getTrickLevel());
    }

    @Test
    void testGetHabits() {
        assertArrayEquals(habits, pet.getHabits());
    }

    @Test
    void testSetHabits() {
        String[] newHabits = {"run", "jump"};
        pet.setHabits(newHabits);
        assertArrayEquals(newHabits, pet.getHabits());
    }

    @Test
    void testToString() {
        String expected = "CAT{nickname='Whiskers', age=3, trickLevel=75, habits=[eat, sleep, play]}";
        assertEquals(expected, pet.toString());
    }

    @Test
    void testEquals() {
        Pet pet2 = new Pet(Species.CAT, "Whiskers", 3, 75, habits);
        assertTrue(pet.equals(pet2));
    }

    @Test
    void testHashCode() {
        Pet pet2 = new Pet(Species.CAT, "Whiskers", 3, 75, habits);
        assertEquals(pet.hashCode(), pet2.hashCode());
    }
}

