import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
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
}
