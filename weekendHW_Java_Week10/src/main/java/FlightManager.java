public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int baggageForFlight(Flight flight){
        return flight.getPlaneWeight() / 3;
    }

    public int passengerBaggage(Flight flight){
        return flight.getNumberOfBags() * 5;
    }

    public int remainingBaggage(Flight flight){
        return baggageForFlight(flight) - passengerBaggage(flight);
    }
}
