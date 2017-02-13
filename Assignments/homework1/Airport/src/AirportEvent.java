//Apaar Shanker

public class AirportEvent extends Event {
    public static final int PLANE_ARRIVES = 0;
    public static final int PLANE_LANDED = 1;
    public static final int PLANE_DEPARTS = 2;

    AirportEvent(double delay, EventHandler handler, int eventType) {
        super(delay, handler, eventType);
    }
}
