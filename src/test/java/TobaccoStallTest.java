import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Molly's Smokes", "Molly", "12", 3 );
        visitor1 = new Visitor(19, 145, 30);
        visitor2 = new Visitor(15, 125, 30);

    }

    @Test
    public void getName() {
        assertEquals("Molly's Smokes", tobaccoStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Molly", tobaccoStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("12", tobaccoStall.getParkingSpot());
    }

    @Test
    public void getRating() {
        assertEquals(3, tobaccoStall.getRating());
    }

    @Test
    public void canServeOfAgeVisitor(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void cannotServeNotOfAgeVisitor(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }
}
