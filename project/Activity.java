public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int enrolled;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public boolean isAvailable() {
        return enrolled < capacity;
    }

    // Getters and setters
}
