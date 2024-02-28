import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            System.out.println("Activities:");
            List<Activity> activities = destination.getAvailableActivities();
            for (Activity activity : activities) {
                System.out.println("- Name: " + activity.getName());
                System.out.println("  Description: " + activity.getDescription());
                System.out.println("  Cost: $" + activity.getCost());
                System.out.println("  Capacity: " + activity.getCapacity());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        System.out.println("Passengers:");
        for (Passenger passenger : passengers) {
            System.out.println("- Name: " + passenger.getName());
            System.out.println("  Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            List<Activity> activities = destination.getAvailableActivities();
            for (Activity activity : activities) {
                System.out.println("- " + activity.getName() + " at " + destination.getName() +
                        " (Capacity: " + activity.getCapacity() + ")");
            }
        }
    }

    // Getters and setters
}
