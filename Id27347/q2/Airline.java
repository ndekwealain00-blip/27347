package Id27347.q2;

import java.time.LocalDate;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, LocalDate createdDate, LocalDate updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        if (airlineCode == null || !airlineCode.matches("[A-Za-z]{2,4}"))
            throw new IllegalArgumentException("Airline code must be 2-4 letters");
        this.airlineCode = airlineCode;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.contains("@"))
            throw new IllegalArgumentException("Invalid email format");
        this.contactEmail = contactEmail;
    }
}
