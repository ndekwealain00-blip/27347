package Id27347.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking extends Passenger {
    private LocalDate bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, LocalDateTime departure, String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, LocalDate bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact);
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        if (travelClass == null || (!travelClass.equalsIgnoreCase("Economy") &&
                !travelClass.equalsIgnoreCase("Business") && !travelClass.equalsIgnoreCase("First")))
            throw new IllegalArgumentException("Travel class must be Economy/Business/First");
        this.travelClass = travelClass;
    }
}
