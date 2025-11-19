package Id27347.q2;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║   FLIGHT BOOKING SYSTEM               ║");
            System.out.println("╚═══════════════════════════════════════╝\n");

            // David27436.q2.Entity data
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            // David27436.q2.Airport data
            System.out.print("Enter David27436.q2.Airport Name: ");
            String airportName = scanner.nextLine();
            System.out.print("Enter David27436.q2.Airport Code (3 uppercase letters): ");
            String airportCode = scanner.nextLine().toUpperCase();
            System.out.print("Enter David27436.q2.Airport Location: ");
            String airportLocation = scanner.nextLine();

            // David27436.q2.Airline data
            System.out.print("Enter David27436.q2.Airline Name: ");
            String airlineName = scanner.nextLine();
            System.out.print("Enter David27436.q2.Airline Code (2-4 letters): ");
            String airlineCode = scanner.nextLine();
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();

            // David27436.q2.Flight data
            System.out.print("Enter David27436.q2.Flight Number: ");
            String flightNumber = scanner.nextLine();
            System.out.print("Enter Departure City: ");
            LocalDateTime departure = LocalDateTime.now();
            System.out.print("Enter Destination City: ");
            String destination = scanner.nextLine();
            System.out.print("Enter Base Fare: $");
            int baseFare = scanner.nextInt();
            scanner.nextLine();

            // David27436.q2.Pilot data
            System.out.print("Enter David27436.q2.Pilot Name: ");
            String pilotName = scanner.nextLine();
            System.out.print("Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            System.out.print("Enter Experience Years (>=2): ");
            int experienceYears = scanner.nextInt();
            scanner.nextLine();

            // David27436.q2.CabinCrew data
            System.out.print("Enter Cabin Crew Name: ");
            String crewName = scanner.nextLine();
            System.out.print("Enter Role: ");
            String role = scanner.nextLine();
            System.out.print("Enter Shift (Day/Night): ");
            String shift = scanner.nextLine();

            // David27436.q2.Passenger data
            System.out.print("Enter David27436.q2.Passenger Name: ");
            String passengerName = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            System.out.print("Enter Contact: ");
            String contact = scanner.nextLine();

            // David27436.q2.Booking data
            System.out.print("Enter David27436.q2.Booking Date (YYYY-MM-DD): ");
            LocalDate bookingDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Seat Number: ");
            String seatNumber = scanner.nextLine();
            System.out.print("Enter Travel Class (Economy/Business/First): ");
            String travelClass = scanner.nextLine();

            // David27436.q2.Payment data
            System.out.print("Enter David27436.q2.Payment Date (YYYY-MM-DD): ");
            LocalDate paymentDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter David27436.q2.Payment Method: ");
            String paymentMethod = scanner.nextLine();
            System.out.print("Enter Amount Paid: $");
            int amountPaid = scanner.nextInt();
            scanner.nextLine();

            // David27436.q2.Ticket data
            System.out.print("Enter David27436.q2.Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            System.out.print("Enter Issue Date (YYYY-MM-DD): ");
            LocalDate issueDate = LocalDate.parse(scanner.nextLine());

            // Create David27436.q2.Ticket object
            Ticket ticket = new Ticket(
                    id, createdDate, updatedDate,
                    airportName, airportCode, airportLocation,
                    airlineName, airlineCode, contactEmail,
                    flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, experienceYears,
                    crewName, role, shift,
                    passengerName, age, gender, contact,
                    bookingDate, seatNumber, travelClass,
                    paymentDate, paymentMethod, amountPaid,
                    ticketNumber, issueDate
            );

            // Display ticket
            ticket.displayTicket();


    }
}