import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkTest {

    Park park;

    @Before
    public void setUp() {
        park = new Park("Green Park", 2);
    }

    @Test
    public void getName() {
        assertEquals("Green Park", park.getName());
    }

    @Test
    public void getRating() {
        assertEquals(2, park.getRating());
    }
}