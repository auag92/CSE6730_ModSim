//Apaar Shanker

// added private variables to store number of passengers, speed
// added methods to return number of passengers and speed

public class Airplane {
    private String m_name;
    private int m_numberPassengers;
    private int m_speed;
    public void Airplane(String name) {
        m_name = name;
    }
    public void Speed(int speed) {
      m_speed = speed;
    }
    public void NumberPassengers(int numberPassengers) {
      m_numberPassengers = numberPassengers;
    }
    public int getNumberPassengers() {
      return m_numberPassengers;
    }
    public int getSpeed() {
      return m_speed;
    }
    public String getName() {
      return m_name;
    }
}
