package Id27347.q3;

import java.time.LocalDate;

public class TaxAssessment extends TaxDeclaration {
    LocalDate assessmentDate;
    double assessedTax;

    public TaxAssessment(int id, LocalDate createdDate, LocalDate updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, int salary, String employeeTIN, String declarationMonth, double totalIncome, LocalDate assessmentDate, double assessedTax) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome);
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public double getAssessedTax() {
        return assessedTax;
    }

    public void setAssessedTax(double assessedTax) {
        this.assessedTax = assessedTax;
    }
}
