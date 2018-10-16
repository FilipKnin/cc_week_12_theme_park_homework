import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction attraction;
    Stall stall;
    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(18,200,240.00);
        attraction = new Dodgems("Dodgems");
        stall = new TobaccoStall("name", "ownerName");
        themePark = new ThemePark();
    }

    @Test
    public void countAttractions() {
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void countStalls() {
        assertEquals(0, themePark.countStalls());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(stall);
        assertEquals(1, themePark.countStalls());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(attraction);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void hasVisit() {
        themePark.addAttraction(attraction);
        assertEquals("Visitor has visited Dodgems", themePark.visit(visitor, attraction));
    }


}
