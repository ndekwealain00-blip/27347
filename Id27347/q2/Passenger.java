package Id27347.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, LocalDateTime departure, String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift);
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || (!gender.equalsIgnoreCase("Male") &&
                !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other")))
            throw new IllegalArgumentException("Gender must be valid (Male/Female/Other)");
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
