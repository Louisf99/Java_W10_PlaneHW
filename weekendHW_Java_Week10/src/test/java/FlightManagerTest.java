import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Flight flight1;

    Plane plane;
    Plane plane1;

    Pilot pilot;

    ArrayList<CabinCrewMember> CabinCrew = new ArrayList<>();
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    ArrayList<Passenger> Passengers = new ArrayList<>();
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737, 3,400);
        plane1 = new Plane(PlaneType.BOEING747, 5, 300);

        pilot = new Pilot("Craig", RankType.FIRST_OFFICER, "1234567");

        cabinCrewMember1 = new CabinCrewMember("Susan", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Louis", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Ben", RankType.CAPTAIN);
        CabinCrew.add(cabinCrewMember1);
        CabinCrew.add(cabinCrewMember2);
        CabinCrew.add(cabinCrewMember3);

        passenger1 = new Passenger("Jack", 1);
        passenger2 = new Passenger("Callum", 2);
        passenger3 = new Passenger("Cammy", 2);
        Passengers.add(passenger1);
        Passengers.add(passenger2);
        Passengers.add(passenger3);

        flight = new Flight(pilot, plane, CabinCrew, Passengers, "FN1","EDI","LDN", "10:00");
        flight1 = new Flight(pilot, plane1, CabinCrew, Passengers, "FN2", "GLA", "LDN", "16:00" );
        flightManager = new FlightManager(flight);
    }

@Test
    public void baggageForFlight() {
        assertEquals(133, flightManager.baggageForFlight(flight));
    }

    @Test
    public void passengerBaggage() {
        assertEquals(25, flightManager.passengerBaggage(flight));
    }

    @Test
    public void remainingBaggage() {
        assertEquals(75, flightManager.remainingBaggage(flight1));
    }
}
