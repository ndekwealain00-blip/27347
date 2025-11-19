package Id27347.q3;

import java.time.LocalDate;

public class TaxDeclaration extends Employee{
    String declarationMonth;
    double totalIncome;

    public TaxDeclaration(int id, LocalDate createdDate, LocalDate updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, int salary, String employeeTIN, String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public String getDeclarationMonth() {
        return declarationMonth;
    }

    public void setDeclarationMonth(String declarationMonth) {
        this.declarationMonth = declarationMonth;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }
}
