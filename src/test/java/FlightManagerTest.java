import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane1;
    Plane plane5;
    Flight flight1;
    Flight flight2;
    FlightManager flightManager;

    @Before
    public void before(){
        passenger1 = new Passenger("Sophia",2, flight1);
        passenger2 = new Passenger("Audrey",1, flight1);
        passenger3 = new Passenger("Nathan",0, flight1);
        Date date1 = new Date(2020, 2, 5, 15, 30);
        plane1 = new Plane(PlaneType.A330_200);
        plane5 = new Plane(PlaneType.Audrey233);
        flight1 = new Flight(plane1,"BE2107", "London", "Edinburgh", date1);
        flight2 = new Flight(plane5,"AU2333", "London", "Edinburgh", date1);
        flightManager = new FlightManager(flight1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
    }

    @Test
    public void flightManagerCanCalculateTotalBaggageLimit(){
        assertEquals(121000,flightManager.totalBaggageLimit());
    }

    @Test
    public void flightManagerCanCalculatePerPassengerBagAllowance(){
        assertEquals(298.00,flightManager.perPassengerBaggageAllowance(),0.01);
    }

    @Test
    public void flightManagerCanCalculatePassengersBagTotalWeight(){
        assertEquals(60,flightManager.passengersBaggageWeightInTotal());
    }

    @Test
    public void flightManagerCanCalculatePassengerBaggageTotalWeightRemains(){
        assertEquals(120940,flightManager.passengersBaggageWeightRemainInTotal());
    }
}
