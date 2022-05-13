import Crew.CabinCrewMember;
import Crew.CrewRank;
import Crew.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewTest {

    private Passenger passenger1, passenger2;
    private CabinCrewMember crew1, crew2;
    private Pilot pilot1, pilot2;


    @Before
    public void before(){
        passenger1 = new Passenger("Kevin", 2);
        passenger2 = new Passenger("The President", 10);
        crew1 = new CabinCrewMember("Robert", CrewRank.CABINCREW);
        crew2 = new CabinCrewMember("Sarah", CrewRank.PURSER);
        pilot1 = new Pilot("David", CrewRank.CAPTAIN, "JA12345");
        pilot2 = new Pilot("Lucy", CrewRank.COPILOT, "JA55667");
    }

    @Test
    public void doesCrewHaveName(){
        assertEquals("Robert", crew1.getName());
    }

    @Test
    public void doesCrewHaveRank(){
        assertEquals(CrewRank.CABINCREW, crew1.getRank());
        assertEquals(CrewRank.PURSER, crew2.getRank());
        assertEquals(CrewRank.CAPTAIN, pilot1.getRank());
        assertEquals(CrewRank.COPILOT, pilot2.getRank());
    }

    @Test
    public void doesPilotHaveLicenseNumber(){
        assertEquals("JA12345", pilot1.getLicenseNumber());
    }
}
