import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("name", "ownerName");
    }

    @Test
    public void hasName() {
        assertEquals("name", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("ownerName", candyFlossStall.getOwnerName());
    }

    @Test
    public void countParkingSpots() {
        assertEquals(0, candyFlossStall.countParkingSpots());
    }
}
