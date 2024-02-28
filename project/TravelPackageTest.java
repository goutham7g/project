import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TravelPackageTest {

    @Test
    public void testPrintItinerary() {
        List<Destination> itinerary = new ArrayList<>();
        Destination mountainDestination = new Destination("Mountain");
        Activity hiking = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        Activity skiing = new Activity("Skiing", "Snow skiing", 100.0, 5);
        mountainDestination.addActivity(hiking);
        mountainDestination.addActivity(skiing);
        itinerary.add(mountainDestination);

        TravelPackage travelPackage = new TravelPackage("Mountain Trip", 20, itinerary);
        travelPackage.printItinerary();
    }

    @Test
    public void testPrintPassengerList() {
        List<Destination> itinerary = new ArrayList<>();
        TravelPackage travelPackage = new TravelPackage("Mountain Trip", 20, itinerary);
        travelPackage.printPassengerList();
    }

    @Test
    public void testPrintAvailableActivities() {
        List<Destination> itinerary = new ArrayList<>();
        Destination mountainDestination = new Destination("Mountain");
        Activity hiking = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        Activity skiing = new Activity("Skiing", "Snow skiing", 100.0, 5);
        mountainDestination.addActivity(hiking);
        mountainDestination.addActivity(skiing);
        itinerary.add(mountainDestination);

        TravelPackage travelPackage = new TravelPackage("Mountain Trip", 20, itinerary);
        travelPackage.printAvailableActivities();
    }
}
