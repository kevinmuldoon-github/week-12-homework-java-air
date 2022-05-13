import Crew.CabinCrewMember;
import Crew.Pilot;
import Plane.Plane;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> flightPilots;
    private ArrayList<CabinCrewMember> flightCrew;
    private ArrayList<Passenger> flightPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String airport;
    private String time;

    public Flight(Plane plane, String flightNumber, String destination, String airport, String time) {
        this.flightPilots = new ArrayList<>();
        this.flightCrew = new ArrayList<>();
        this.flightPassengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.time = time;
    }

    public ArrayList<Pilot> getFlightPilots() {
        return flightPilots;
    }

    public void setFlightPilots(ArrayList<Pilot> flightPilots) {
        this.flightPilots = flightPilots;
    }
}
