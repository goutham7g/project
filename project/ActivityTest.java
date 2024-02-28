import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void testIsAvailable() {
        Activity activity = new Activity("Hiking", "Mountain hiking", 50.0, 10);
        assertTrue(activity.isAvailable());
        for (int i = 0; i < 10; i++) {
            activity.enrollPassenger();
        }
        assertFalse(activity.isAvailable());
    }
}
