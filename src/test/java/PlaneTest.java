import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane boeing, airbus, bombardier, embrarer;


    @Before
    public void before(){

        boeing = new Plane(PlaneType.BOEING747);
        airbus = new Plane(PlaneType.AIRBUSA320);
        bombardier = new Plane(PlaneType.BOMBARDIERCRJ200);
        embrarer = new Plane(PlaneType.EMBRAERE175);
    }

    @Test
    public void planeHasPlaneType(){
        assertEquals(PlaneType.BOEING747,boeing.getPlaneType());
        assertEquals(PlaneType.AIRBUSA320,airbus.getPlaneType());
        assertEquals(PlaneType.BOMBARDIERCRJ200,bombardier.getPlaneType());
        assertEquals(PlaneType.EMBRAERE175,embrarer.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(162, boeing.getPlaneType().getCapacity());
        assertEquals(180, airbus.getPlaneType().getCapacity());
        assertEquals(52, bombardier.getPlaneType().getCapacity());
        assertEquals(88, embrarer.getPlaneType().getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(41400, boeing.getPlaneType().getWeight());
        assertEquals(77000, airbus.getPlaneType().getWeight());
        assertEquals(24040, bombardier.getPlaneType().getWeight());
        assertEquals(40370, embrarer.getPlaneType().getWeight());
    }


}
