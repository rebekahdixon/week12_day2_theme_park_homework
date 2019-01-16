import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() {
        iceCreamStall = new IceCreamStall("Frosty's", "Penguin Pete", "14", 4);
    }

    @Test
    public void getName() {
      assertEquals("Frosty's", iceCreamStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Penguin Pete", iceCreamStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("14", iceCreamStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        assertEquals(4, iceCreamStall.getRating());
    }
}