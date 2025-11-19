package Id27347.q4;

import java.time.LocalDate;

public class Department extends Organization {
    String deptName;
    String deptCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+"))
            throw new IllegalArgumentException("Department code must be alphanumeric and >= 3 chars");
        this.deptCode = deptCode;
    }
}
