import Crew.CabinCrewMember;
import Crew.Crew;
import Crew.CrewRank;
import Crew.Pilot;
import Plane.Plane;
import org.junit.Before;
import Plane.PlaneType;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FlightTest {
    private CabinCrewMember crew1, crew2;
    private Pilot pilot1, pilot2;
    private Plane plane;

    private Flight flight;


    @Before
    public void before(){
        crew1 = new CabinCrewMember("Robert", CrewRank.CABINCREW);
        crew2 = new CabinCrewMember("Sarah", CrewRank.PURSER);
        pilot1 = new Pilot("David", CrewRank.CAPTAIN, "JA12345");
        pilot2 = new Pilot("Lucy", CrewRank.COPILOT, "JA55667");
        plane = new Plane(PlaneType.AIRBUSA320);

        flight = new Flight(plane, "GLA33990", "Glasgow", "Jakarta", "09:00" );
    }

//    @Test
//    public void canSetPilots(){
//
//        flight.setFlightPilots();
//    }

}
