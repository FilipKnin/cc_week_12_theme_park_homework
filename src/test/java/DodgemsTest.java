import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {


    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Dodgems");
        visitor1 = new Visitor(13, 150, 240.00);
        visitor2 = new Visitor(10, 150, 240.00);
        visitor3 = new Visitor(14, 120, 240.00);
        visitor4 = new Visitor(14, 210, 240.00);
    }

    @Test
    public void hasName() {
        assertEquals("Dodgems", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasSpecialPriceForLess12() {
        assertEquals(2.25, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void hasNoSpecialPriceForMore() {
        assertEquals(4.50, dodgems.priceFor(visitor1), 0.01);
    }
}
