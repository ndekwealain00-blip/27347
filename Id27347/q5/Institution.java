package Id27347.q5;

import java.time.LocalDate;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, LocalDate createdDate, LocalDate updatedDate, String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
