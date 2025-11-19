package Id27347.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight extends Airline {
    private String flightNumber;
    private LocalDateTime departure;
    private String destination;
    private int baseFare;

    public Flight(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, LocalDateTime departure, String destination, int baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.isEmpty())
            throw new IllegalArgumentException("Flight number cannot be empty");
        this.flightNumber = flightNumber;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination == null || destination.isEmpty())
            throw new IllegalArgumentException("Destination cannot be empty");
        this.destination = destination;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(int baseFare) {
        if (baseFare <= 0) throw new IllegalArgumentException("Base fare must be > 0");
        this.baseFare = baseFare;
    }
}
