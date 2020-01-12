import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Flight flight1;
    Flight unbooked;


    @Before
    public void before(){
        passenger1 = new Passenger("Sophia",2, flight1);
        passenger2 = new Passenger("Audrey",1, flight1);
        passenger3 = new Passenger("Nathan",0, flight1);
        passenger4 = new Passenger("Duggie",0,unbooked);
    }

    @Test
    public void passengerHasInitialValues(){
        assertEquals("Sophia",passenger1.getName());
        assertEquals(0,passenger3.getBag());

    }

    @Test
    public void passengerHasBagWeight(){
        assertEquals(40,passenger1.getBagWeight());

    }

    @Test
    public void passengerHasFlight(){
        assertEquals(flight1,passenger1.getFlight());
    }

    @Test
    public void passengerHasFlightAfterBeingBooked(){
        passenger4.bookFlight(flight1);
        assertEquals(flight1,passenger4.getFlight());
    }

//    @Test
//    public void passengerSeatNumber(){
//        passenger4.bookFlight(flight1);
//        assertEquals(0,passenger4.getSeatNumber());
//    }


}
