import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testSignUpForActivity() {
        Passenger standardPassenger = new Passenger("John", 1, PassengerType.STANDARD, 100.0);
        Passenger goldPassenger = new Passenger("Alice", 2, PassengerType.GOLD, 200.0);
        Passenger premiumPassenger = new Passenger("Bob", 3, PassengerType.PREMIUM, 0.0);

        Activity hiking = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        Activity skiing = new Activity("Skiing", "Snow skiing", 100.0, 5);

        assertTrue(standardPassenger.signUpForActivity(hiking));
        assertTrue(goldPassenger.signUpForActivity(hiking));
        assertTrue(premiumPassenger.signUpForActivity(hiking));

        assertTrue(standardPassenger.signUpForActivity(skiing));
        assertTrue(goldPassenger.signUpForActivity(skiing));
        assertTrue(premiumPassenger.signUpForActivity(skiing));

        assertEquals(50.0, standardPassenger.getBalance(), 0.0);
        assertEquals(145.0, goldPassenger.getBalance(), 0.0);
        assertEquals(0.0, premiumPassenger.getBalance(), 0.0);
    }
}
