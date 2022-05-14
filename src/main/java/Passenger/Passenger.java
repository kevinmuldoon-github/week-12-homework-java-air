package Passenger;

import Flight.Flight;

import java.util.ArrayList;

public class Passenger {
    private String name;
    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public String getFlightNumber() {
        return flight.getFlightNumber();
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
        assignSeatNumber(flight);
    }

    public void assignSeatNumber(Flight flight){
        int flightCapacity = flight.getPlane().getPlaneType().getCapacity();
        this.seatNumber = (int)Math.floor(Math.random()*(flightCapacity-1+1)+1);

        for (int i=0; i < flight.getFlightPassengers().size(); i++) { // check seat is not assigned
            int assignedSeat = flight.getFlightPassengers().get(i).getSeatNumber();
            if (assignedSeat == this.seatNumber) {
                this.seatNumber = (int)Math.floor(Math.random()*(flightCapacity-1+1)+1); // reassign seat number
            } // end if
        } // end for loop
    }

    public Boolean isSeatAssigned() {

        Boolean seatAssigned=false;

        if (this.seatNumber != 0) {
            seatAssigned=true;
        }
        return seatAssigned;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
