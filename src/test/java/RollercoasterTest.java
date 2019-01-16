import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp() {
        rollercoaster = new Rollercoaster("Rollercoaster", 1);
    }

    @Test
    public void getName() {
        assertEquals("Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void getRating() {
        assertEquals(1, rollercoaster.getRating());
    }
}