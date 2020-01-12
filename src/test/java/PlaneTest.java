import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane1;
    Plane plane2;
    @Before
    public void before(){
        plane1 = new Plane(PlaneType.A330_200);
        plane2 = new Plane(PlaneType.A340);
    }
    @Test
    public void planeHasPlaneType(){
        assertEquals(PlaneType.A330_200, plane1.getPlaneType());
    }
    @Test
    public void planeHasCapacity(){
        assertEquals(406,plane1.getPlaneTypeCapacity());
    }
    @Test
    public void planeHasTotalWeight(){
        assertEquals(242000, plane1.getPlaneTypeTotalWeight());
    }
}
