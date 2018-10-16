import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;

    @Before
    public void before() {
        visitor1 = new Visitor(12, 180, 240.00);
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
}
