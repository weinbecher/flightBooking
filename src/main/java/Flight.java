import java.util.ArrayList;

public class Flight {
    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
}
