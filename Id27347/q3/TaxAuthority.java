package Id27347.q3;

import java.time.LocalDate;

public class TaxAuthority extends Entity{
    String authorityName;
    String region;
    String email;

    public TaxAuthority(int id, LocalDate createdDate, LocalDate updatedDate, String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }


    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
