import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane1;
    Plane plane5;
    Flight flight1;
    Flight flight2;

    @Before
    public void before(){
        passenger1 = new Passenger("Sophia",2);
        passenger2 = new Passenger("Audrey",1);
        passenger3 = new Passenger("Nathan",0);
        plane1 = new Plane(PlaneType.A330_200);
        plane5 = new Plane(PlaneType.Audrey233);
        flight1 = new Flight(plane1,"BE2107", "London", "Edinburgh", "15:50");
        flight2 = new Flight(plane5,"AU2333", "London", "Edinburgh", "23:50");

    }

    @Test
    public void flightStartWithNoPassengers(){
        assertEquals(0,flight1.countPassengers());
    }

    @Test
    public void flightHasPassengers(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(3,flight1.countPassengers());
    }

    @Test
    public void flightHasSeats(){
        assertEquals(406,flight1.countSeats());
    }


    @Test
    public void flightCanCountAvailableSeats(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(403,flight1.availableSeat());
    }

    @Test
    public void flightCanNotBookAPassenger(){
        flight2.addPassenger(passenger1);
        assertEquals(false,flight2.bookPassenger(passenger2));
    }

    @Test
    public void flightCanBookAPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(true,flight1.bookPassenger(passenger2));
        assertEquals(2,flight1.countPassengers());

    }



}
