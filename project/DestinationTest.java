import org.junit.Test;
import static org.junit.Assert.*;

public class DestinationTest {

    @Test
    public void testGetAvailableActivities() {
        Destination destination = new Destination("Mountain");
        Activity hiking = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        Activity skiing = new Activity("Skiing", "Snow skiing", 100.0, 5);
        destination.addActivity(hiking);
        destination.addActivity(skiing);
        assertEquals(2, destination.getAvailableActivities().size());
        hiking.setEnrolled(10);
        assertEquals(1, destination.getAvailableActivities().size());
    }
}
