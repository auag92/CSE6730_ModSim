//Apaar Shanker
// LAX - Los Angeles
// BWI - Baltimore  - Washington D.C.
// ATL - Atlanta
// DFW - Dallas Fort-Worth
// ORD - Chicago O'hare
import java.util.TreeSet;


public class AirportSim {
    public static void main(String[] args) {

        Airport lax = new Airport("LAX", 10, 10, 20);

        AirportEvent landingEvent = new AirportEvent(5, lax, AirportEvent.PLANE_ARRIVES);
        Simulator.schedule(landingEvent);

        Simulator.stopAt(50);
        Simulator.run();
    }
}
