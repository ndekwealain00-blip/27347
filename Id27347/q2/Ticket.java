package Id27347.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket extends Payment {
    String myId = "27347";
    String ticketNumber;
    LocalDate issueDate;

    public Ticket(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, LocalDateTime departure, String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, LocalDate bookingDate, String seatNumber, String travelClass, LocalDate paymentDate, String paymentMethod, int amountPaid, String ticketNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public double calculateFare() {
        double taxes = getBaseFare() * 0.15; // 15% tax
        double discount = 0;

        // Discounts based on travel class
        if (getTravelClass().equalsIgnoreCase("Economy")) {
            discount = getBaseFare() * 0.05; // 5% discount
        } else if (getTravelClass().equalsIgnoreCase("Business")) {
            discount = getBaseFare() * 0.10; // 10% discount
        } else if (getTravelClass().equalsIgnoreCase("First")) {
            discount = getBaseFare() * 0.15; // 15% discount
        }

        return getBaseFare() + taxes - discount;
    }

    public void displayTicket() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("  ║         FLIGHT BOOKING TICKET              ║");
        System.out.println("  ╚════════════════════════════════════════════╝\n");


        System.out.println("\n━━━━━━━━━━━━━ TICKET DETAILS ━━━━━━━━━━━━━");
        System.out.println(myId + "Ticket Number: " + ticketNumber);
        System.out.println(myId +" Issue Date: " + issueDate);
        System.out.println("\n━━━━━━━━━━━━━ FARE CALCULATION ━━━━━━━━━━━━");
        System.out.println(myId +" Base Fare: $" + getBaseFare());
        System.out.println(myId +" Taxes (15%): $" + String.format("%.2f", getBaseFare() * 0.15));
        System.out.println(myId +" Discount: $" + String.format("%.2f",
                getTravelClass().equalsIgnoreCase("Economy") ? getBaseFare() * 0.05 :
                        getTravelClass().equalsIgnoreCase("Business") ? getBaseFare() * 0.10 :
                                getBaseFare() * 0.15));
        System.out.println("─────────────────────────────────────────────");
        System.out.println(myId + "TOTAL FARE: $" + String.format("%.2f", calculateFare()));
        System.out.println("═════════════════════════════════════════════\n");
    }
}
