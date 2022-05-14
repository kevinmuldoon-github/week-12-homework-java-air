package Flight;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }


    public double allocatedBagWeight(){
        int planeWeight = flight.getPlane().getPlaneType().getWeight();
        int planeCapacity = flight.getPlane().getPlaneType().getCapacity();
        double bagWeight = planeWeight/2/planeCapacity;
        return bagWeight;
    }

    public double totalBaggageWeight(){
        return allocatedBagWeight()* flight.numberOfPassengers();
    }

    public double availableBaggageWeight(){
        int planeWeight = flight.getPlane().getPlaneType().getWeight();
        double availableWeight = planeWeight/2 - totalBaggageWeight();
        return availableWeight;
    }


}
