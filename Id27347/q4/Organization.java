package Id27347.q4;

import java.time.LocalDate;

public class Organization extends Entity {
    String orgName;
    String address;
    String contactEmail;

    public Organization(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }



    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
