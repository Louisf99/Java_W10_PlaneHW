import java.util.ArrayList;

public class Flight {

    public Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
    public ArrayList<Passenger> passengers = new ArrayList<>();
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot _pilot, Plane _plane, ArrayList<CabinCrewMember> _cabinCrewMembers,
                  ArrayList<Passenger> _passengers, String _flightNumber, String _destination,
                  String _departureAirport, String _departureTime){
        this.pilot = _pilot;
        this.plane = _plane;
        this.cabinCrewMembers = _cabinCrewMembers;
        this.passengers = _passengers;
        this.flightNumber = _flightNumber;
        this.destination = _destination;
        this.departureAirport = _departureAirport;
        this.departureTime = _departureTime;
    }

    public int availableSeats(){
        return plane.getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger _passenger){
        if(this.availableSeats()>0){
            passengers.add(_passenger);}
        else {
            System.out.println("Not enough available seats");
        }
    }

    public String flyPlane(){
        return pilot.flyPlane();
    }

    public String relayMessages(CabinCrewMember _cabinCrewMember){
        return _cabinCrewMember.relayMessages();
    }

    public int getPlaneWeight(){
        return plane.getWeight();
    }

    public int getNumberOfBags(){
        int totalBags = 0;
        for (Passenger _passenger: passengers){
            totalBags += _passenger.getBags();
        }
        return totalBags;
    }

}