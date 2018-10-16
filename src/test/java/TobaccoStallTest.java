import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        visitor1 = new Visitor(12, 180, 240.00);
        visitor2 = new Visitor(18, 180, 240.00);
        tobaccoStall = new TobaccoStall("name", "ownerName");
    }

    @Test
    public void hasName() {
        assertEquals("name", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("ownerName", tobaccoStall.getOwnerName());
    }

    @Test
    public void countParkingSpots() {
        assertEquals(0, tobaccoStall.countParkingSpots());
    }

    @Test
    public void hasIsAllowedFalse() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void hasIsAllowedTrue(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}
