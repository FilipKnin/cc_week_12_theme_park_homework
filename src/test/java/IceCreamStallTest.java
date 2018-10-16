import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("name", "ownerName");
    }

    @Test
    public void hasName() {
        assertEquals("name", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("ownerName", iceCreamStall.getOwnerName());
    }

    @Test
    public void countParkingSpots() {
        assertEquals(0, iceCreamStall.countParkingSpots());
    }
}
