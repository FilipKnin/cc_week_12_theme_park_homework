import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before() {
        visitor1 = new Visitor(12, 180, 240.00);
        visitor2 = new Visitor(18, 180, 240.00);
        playground = new Playground("Playground");
    }

    @Test
    public void hasName() {
        assertEquals("Playground", playground.getName());
    }

    @Test
    public void hasIsAllowed() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void hasIsAllowedFalse() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
