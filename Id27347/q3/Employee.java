package Id27347.q3;

import java.time.LocalDate;

public class Employee extends Employer {
    String employeeName;
    double salary;
    String employeeTIN;

    public Employee(int id, LocalDate createdDate, LocalDate updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, int salary, String employeeTIN) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeTIN = employeeTIN;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeTIN() {
        return employeeTIN;
    }

    public void setEmployeeTIN(String employeeTIN) {
        this.employeeTIN = employeeTIN;
    }
}
