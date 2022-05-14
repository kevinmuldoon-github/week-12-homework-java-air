package Flight;

import Crew.CabinCrewMember;
import Crew.Crew;
import Crew.CrewRank;
import Crew.Pilot;
import Plane.Plane;
import java.util.ArrayList;
import java.util.Date;

import Passenger.Passenger;

public class Flight {

    private ArrayList<Pilot> flightPilots;
    private ArrayList<CabinCrewMember> flightCrew;
    private ArrayList<Passenger> flightPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String airport;
    private Date time;

    public Flight(Plane plane, String flightNumber, String destination, String airport, Date time) {
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

    public void addFlightPilot(Pilot newPilot) {
        this.flightPilots.add(newPilot);
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public ArrayList<Passenger> getFlightPassengers() {
        return flightPassengers;
    }

    public int numberOfPilots(){
        return this.flightPilots.size();
    }

    public void addCrewMember(CabinCrewMember newCrew){
        this.flightCrew.add(newCrew);
    }

    public int numberOfCrew(){
        return this.flightCrew.size();
    }

    public void bookPassenger(Passenger newPassenger){
        if (numberOfRemainingSeats() > 0) {
            this.flightPassengers.add(newPassenger);
            newPassenger.setFlight(this);
        }
    }

    public int numberOfPassengers(){
        return this.flightPassengers.size();
    }

    public int numberOfRemainingSeats(){
        return plane.getPlaneType().getCapacity() - numberOfPassengers();
    }

    public String pilotFlysPlane(Crew crew){
        String message = null;
        if (crew.getRank() == CrewRank.CAPTAIN) {
            message = "Look mum! I'm flying a plane!";
        } else if (crew.getRank() == CrewRank.COPILOT) {
            message = "OMG!!! They've let me fly the plane";
        } else {
            message = "Cabin crew can't fly the plane. You're all going to die. Arghhh!!!";
        }
        return message;
    }

    public String crewMessage(CabinCrewMember crew) {
        String message = String.format("On behalf of JavaAir, we would like to welcome you on flight %s to %s.",
                this.flightNumber,  this.destination);
        return message;
    }
}
