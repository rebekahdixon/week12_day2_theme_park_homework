import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        playground = new Playground("Kids Park", 4);
        visitor1 = new Visitor(10, 120, 9);
        visitor2 = new Visitor(19, 160, 36);
    }

    @Test
    public void isAllowedToVisit() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedToVisit() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }

    @Test
    public void getName() {
        assertEquals("Kids Park", playground.getName());
    }

    @Test
    public void getRating() {
        assertEquals(4, playground.getRating());
    }
}