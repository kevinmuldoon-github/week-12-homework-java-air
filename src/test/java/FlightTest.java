import Crew.CabinCrewMember;
import Crew.CrewRank;
import Crew.Pilot;
import Flight.Flight;
import Flight.FlightManager;
import Passenger.Passenger;
import Plane.Plane;
import org.junit.Before;
import Plane.PlaneType;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Pilot pilot1, pilot2;
    private CabinCrewMember crew1, crew2;
    private Passenger passenger1,passenger2, passenger3, passenger4;
    private Plane plane;

    private Flight flight;
    private FlightManager manager;
    private Date time;


    @Before
    public void before(){
        pilot1 = new Pilot("David", CrewRank.CAPTAIN, "JA12345");
        pilot2 = new Pilot("Lucy", CrewRank.COPILOT, "JA55667");
        crew1 = new CabinCrewMember("Robert", CrewRank.CABINCREW);
        crew2 = new CabinCrewMember("Sarah", CrewRank.PURSER);
        passenger1 = new Passenger("Kevin", 2);
        passenger2 = new Passenger("Dr Su", 2);
        passenger3 = new Passenger("Professor Abagail", 2);
        passenger4 = new Passenger("Buddy Holly", 2);
        plane = new Plane(PlaneType.AIRBUSA320);
        time = new Date();
        time.setTime(50009000);

        flight = new Flight(plane, "GLA33990", "Glasgow", "Jakarta", time);
        manager = new FlightManager(flight);
    }

    @Test
    public void canAddPilots(){
        flight.addFlightPilot(pilot1);
        flight.addFlightPilot(pilot2);
        assertEquals(2, flight.numberOfPilots());
    }

    @Test
    public void canAddCrew(){
        flight.addCrewMember(crew1);
        flight.addCrewMember(crew2);
        assertEquals(2, flight.numberOfCrew());
    }

    @Test
    public void canBookPassengers(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(4, flight.numberOfPassengers());
    }

    @Test
    public void canCalculateNumberOfSpareSeats(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(176, flight.numberOfRemainingSeats());
    }

    @Test
    public void canPilotFlyPlane(){
        assertEquals("Look mum! I'm flying a plane!" , flight.pilotFlysPlane(pilot1));
        assertEquals("OMG!!! They've let me fly the plane" , flight.pilotFlysPlane(pilot2));
        assertEquals("Cabin crew can't fly the plane. You're all going to die. Arghhh!!!" , flight.pilotFlysPlane(crew1));
    }

    @Test
    public void canCrewSpeakToPassengers(){
        assertEquals("On behalf of JavaAir, we would like to welcome you on flight GLA33990 to Glasgow.", flight.crewMessage(crew1));
    }

    @Test
    public void canCalculatePassengerBagWeight(){
        assertEquals(213, manager.allocatedBagWeight(), 0.0);
    }

    @Test
    public void canCalculateBaggageWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(852, manager.totalBaggageWeight(), 0.0);
    }

    @Test
    public void canCalculateAvailableBaggageWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(37648, manager.availableBaggageWeight(), 0.0);
    }

    @Test
    public void canAssignFlightToPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals("GLA33990", passenger1.getFlightNumber());
    }

    @Test
    public void canAssignSeatNumber(){
        flight.bookPassenger(passenger1);
        assertEquals(true, passenger1.isSeatAssigned());
    }

}
