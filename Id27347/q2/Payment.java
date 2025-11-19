package Id27347.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Payment extends Booking {
    LocalDate paymentDate;
    String paymentMethod;
    int amountPaid;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, LocalDateTime departure, String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, LocalDate bookingDate, String seatNumber, String travelClass, LocalDate paymentDate, String paymentMethod, int amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.isEmpty())
            throw new IllegalArgumentException("Payment method cannot be empty");
        this.paymentMethod = paymentMethod;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        if (amountPaid <= 0) throw new IllegalArgumentException("Amount paid must be > 0");
        this.amountPaid = amountPaid;
    }
}
