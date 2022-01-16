import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Louis", 3);
    }

    @Test
    public void getName() {
        assertEquals("Louis", passenger.getName());
    }

    @Test
    public void setName() {
        passenger.setName("Susan");
        assertEquals("Susan", passenger.getName());
    }

    @Test
    public void getBags() {
        assertEquals(3, passenger.getBags());
    }

    @Test
    public void setBags() {
        passenger.setBags(1);
        assertEquals(1, passenger.getBags());
    }
}
