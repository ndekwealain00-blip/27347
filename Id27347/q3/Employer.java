package Id27347.q3;

import java.time.LocalDate;

public class Employer extends Taxpayer {
     String employerName;
     String employerTIN;
     String contact;

    public Employer(int id, LocalDate createdDate, LocalDate updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerTIN() {
        return employerTIN;
    }

    public void setEmployerTIN(String employerTIN) {
        this.employerTIN = employerTIN;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
