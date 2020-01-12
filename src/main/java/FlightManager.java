
public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int totalBaggageLimit() {
        int planeWeight = this.flight.countWeight();
        return planeWeight/2;

    }

    public float perPassengerBaggageAllowance() {
        return totalBaggageLimit()/ this.flight.countSeats();
    }

    public int passengersBaggageWeightInTotal() {
        return this.flight.PassengersBagWeight();
    }

    public int passengersBaggageWeightRemainInTotal() {
        return totalBaggageLimit() - passengersBaggageWeightInTotal();
    }


}
