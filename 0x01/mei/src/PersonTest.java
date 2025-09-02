import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setup() {
        @SuppressWarnings("deprecation")
        Date birthDate = new Date(100, 0, 1);
        
        person = new Person("Paul", "McCartney", birthDate, true, true, true, 0);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        @SuppressWarnings("deprecation")
        Date newBirthDate = new Date(80, 0, 1);
        person = new Person("Paul", "McCartney", newBirthDate, false, false, false, 10000);
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person.setSalary(12000);
        assertFalse(person.isMEI());
    }
}