package happy_familyV2;


import az.edu.turing.happy_familyV2.pets.Dog;
import az.edu.turing.happy_familyV2.pets.Pet;
import az.edu.turing.happy_familyV2.enumm.Species;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Dog dog;
    private String[] habits;

    @BeforeEach
    void setUp() {
        habits = new String[]{"eat", "sleep", "play"};
        dog = new Dog("Whiskers", 3, 75, habits);
    }

    @Test
    void testGetSpecies() {
        assertEquals(Species.DOG, dog.getSpecies());
    }

    @Test
    void testGetNickname() {
        assertEquals("Whiskers", dog.getNickname());
    }

    @Test
    void testSetNickname() {
        dog.setNickname("Rex");
        assertEquals("Rex", dog.getNickname());
    }

    @Test
    void testGetAge() {
        assertEquals(3, dog.getAge());
    }

    @Test
    void testSetAge() {
        dog.setAge(4);
        assertEquals(4, dog.getAge());
    }

    @Test
    void testGetTrickLevel() {
        assertEquals(75, dog.getTrickLevel());
    }

    @Test
    void testSetTrickLevel() {
        dog.setTrickLevel(80);
        assertEquals(80, dog.getTrickLevel());
    }

    @Test
    void testGetHabits() {
        assertArrayEquals(habits, dog.getHabits());
    }

    @Test
    void testSetHabits() {
        String[] newHabits = {"run", "jump"};
        dog.setHabits(newHabits);
        assertArrayEquals(newHabits, dog.getHabits());
    }

    @Test
    void testToString() {
        String expected = "{species=DOGPet{nickname='Whiskers', age=3, trickLevel=75, habits=[eat, sleep, play]}}";
        assertEquals(expected, dog.toString());
    }

    @Test
    void testEquals() {
        Dog dog2 = new Dog("Whiskers", 3, 75, habits);
        assertEquals(dog, dog2);
    }

    @Test
    void testHashCode() {
        Dog dog2 = new Dog("Whiskers", 3, 75, habits);
        assertEquals(dog.hashCode(), dog2.hashCode());
    }
}

