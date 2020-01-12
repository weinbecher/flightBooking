import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    @Before
    public void before(){
        passenger1 = new Passenger("Sophia",2);
        passenger2 = new Passenger("Audrey",1);
        passenger3 = new Passenger("Nathan",0);

    }

    @Test
    public void passengerHasInitialValues(){
        assertEquals("Sophia",passenger1.getName());
        assertEquals(0,passenger3.getBag());

    }
}
