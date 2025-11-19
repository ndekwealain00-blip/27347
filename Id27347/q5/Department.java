package Id27347.q5;

import java.time.LocalDate;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }
}
