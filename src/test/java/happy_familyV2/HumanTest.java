package happy_familyV2;

import az.edu.turing.happy_familyV2.enumm.DayOfWeek;
import az.edu.turing.happy_familyV2.people.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    private Human human;
    private String[][] schedule;

    @BeforeEach
    void setUp() {
        schedule = new String[][]{{DayOfWeek.MONDAY.name(), "gym"}, {DayOfWeek.FRIDAY.name(), "swimming"}};
        human = new Human("Michael", "Karleone", 2004, 90, schedule);
    }

    @Test
    void testGetName() {
        assertEquals("Michael", human.getName());
    }

    @Test
    void testSetName() {
        human.setName("John");
        assertEquals("John", human.getName());
    }

    @Test
    void testGetSurname() {
        assertEquals("Karleone", human.getSurname());
    }

    @Test
    void testSetSurname() {
        human.setSurname("Smith");
        assertEquals("Smith", human.getSurname());
    }

    @Test
    void testGetYear() {
        assertEquals(2004, human.getYear());
    }

    @Test
    void testSetYear() {
        human.setYear(2005);
        assertEquals(2005, human.getYear());
    }

    @Test
    void testGetIq() {
        assertEquals(90, human.getIq());
    }

    @Test
    void testSetIq() {
        human.setIq(100);
        assertEquals(100, human.getIq());
    }

    @Test
    void testGetSchedule() {
        assertArrayEquals(schedule, human.getSchedule());
    }

    @Test
    void testSetSchedule() {
        String[][] newSchedule = {{"TUESDAY", "jogging"}};
        human.setSchedule(newSchedule);
        assertArrayEquals(newSchedule, human.getSchedule());
    }

    @Test
    void testToString() {
        String expected = "Human{name='Michael', surname='Karleone', year=2004, iq=90, schedule=[[MONDAY, gym], [FRIDAY, swimming]]}";
        assertEquals(expected, human.toString());
    }

    @Test
    void testEquals() {
        Human human2 = new Human("Michael", "Karleone", 2004, 90, schedule);
        assertTrue(human.equals(human2));
    }

    @Test
    void testHashCode() {
        Human human2 = new Human("Michael", "Karleone", 2004, 90, schedule);
        assertEquals(human.hashCode(), human2.hashCode());
    }
}

