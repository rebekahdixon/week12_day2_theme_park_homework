import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp() {
        dodgems = new Dodgems("Dave's", 2);
    }

    @Test
    public void getName() {
        assertEquals("Dave's", dodgems.getName());
    }

    @Test
    public void getRating() {
        assertEquals(2, dodgems.getRating());
    }
}