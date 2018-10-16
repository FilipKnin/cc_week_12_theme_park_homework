import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor1;

    @Before
    public void before() {
        visitor1 = new Visitor(13, 150, 240.00);
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

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForVisitor() {
        assertEquals(4.20, candyFlossStall.priceFor(visitor1), 0.01);
    }
}
