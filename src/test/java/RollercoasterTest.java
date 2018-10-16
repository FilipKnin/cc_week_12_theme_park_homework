import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        visitor1 = new Visitor(13, 150, 240.00);
        visitor2 = new Visitor(10, 150, 240.00);
        visitor3 = new Visitor(14, 120, 240.00);
        rollercoaster = new Rollercoaster("Rollercoaster");
    }

    @Test
    public void hasName() {
        assertEquals("Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void hasIsAllowedTrue() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void hasIsAllowedFalseTooYoung() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void hasIsAllowedFalseTooSmall() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor3));
    }
}
