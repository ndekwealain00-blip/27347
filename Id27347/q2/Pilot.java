package Id27347.q2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, LocalDateTime departure, String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isEmpty())
            throw new IllegalArgumentException("License number cannot be empty");
        this.licenseNumber = licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2)
            throw new IllegalArgumentException("Experience years must be >= 2");
        this.experienceYears = experienceYears;;
    }
}
