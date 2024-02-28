import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType type, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    public boolean signUpForActivity(Activity activity) {
        if (type == PassengerType.STANDARD) {
            if (balance >= activity.getCost()) {
                balance -= activity.getCost();
                activities.add(activity);
                activity.enrollPassenger();
                return true;
            } else {
                return false;
            }
        } else if (type == PassengerType.GOLD) {
            double discountedCost = activity.getCost() * 0.9;
            if (balance >= discountedCost) {
                balance -= discountedCost;
                activities.add(activity);
                activity.enrollPassenger();
                return true;
            } else {
                return false;
            }
        } else {
            activities.add(activity);
            activity.enrollPassenger();
            return true;
        }
    }

    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Passenger Type: " + type);
        if (type != PassengerType.PREMIUM) {
            System.out.println("Balance: $" + balance);
        }
        System.out.println("Activities Signed Up:");
        for (Activity activity : activities) {
            System.out.println("- " + activity.getName() + " at " + activity.getDestination().getName() +
                    " (Price: $" + activity.getCost() + ")");
        }
    }

    // Getters and setters
}
