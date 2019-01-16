import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp() {
        candyFlossStall = new CandyFlossStall("Clouds", "Sarah", "21", 5);
    }

    @Test
    public void getName() {
        assertEquals("Clouds", candyFlossStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Sarah", candyFlossStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("21", candyFlossStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        assertEquals(5, candyFlossStall.getRating());
    }
}