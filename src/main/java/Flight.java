import java.util.ArrayList;
import java.util.Date;

public class Flight {
    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    Date departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int countPassengers() {
        return this.passengers.size();
    }


    public ArrayList<Passenger> addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
        return passengers;
    }


    public int countSeats() {
       return this.plane.getPlaneTypeCapacity();
    }

    public int countWeight(){
        return this.plane.getPlaneTypeTotalWeight();
    }

    public int availableSeat() {
        int seats = countSeats();
        int passengerNumber = countPassengers();
        return seats - passengerNumber;
    }

    public boolean bookPassenger(Passenger passenger) {
        if(availableSeat() > 0){
            addPassenger(passenger);
            return true;
        } else {
            return false;
        }
    }

    public int PassengersBagWeight() {
        int passengersBagWeight = 0;
        for(Passenger passenger : passengers) {
            passengersBagWeight += passenger.getBagWeight();
        }
        return passengersBagWeight;
    }

    public Date getDate() {
        return this.departureTime;
    }
}
