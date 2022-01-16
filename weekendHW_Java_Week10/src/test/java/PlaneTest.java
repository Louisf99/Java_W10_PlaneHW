import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {


    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 300, 750);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(300, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(750, plane.getWeight(), 0.0);
    }
}
