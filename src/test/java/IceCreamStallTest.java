import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor visitor1;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("name", "ownerName");
        visitor1 = new Visitor(13, 150, 240.00);
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

    @Test
    public void hasDefaultPrice() {
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForVisitor() {
        assertEquals(2.80, iceCreamStall.priceFor(visitor1), 0.01);
    }
}
