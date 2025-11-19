package Id27347.q3;

import java.time.LocalDate;

public class TaxRecord extends  Payment {
    String myId="27347";
    String receiptNo;
    double totalTax;

    public TaxRecord(int id, LocalDate createdDate, LocalDate updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, int salary, String employeeTIN, String declarationMonth, double totalIncome, LocalDate assessmentDate, double assessedTax, LocalDate paymentDate, double paymentAmount, String receiptNo, double totalTax) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }
    public double computeTax() {
        double credits = 50.0; // Fixed tax credit
        return (getSalary() * getRate()) - credits;
    }
    public void generateTaxRecord() {
        System.out.println("\n╔═══════════════════════════════════════════╗");
        System.out.println("  ║     TAX ADMINISTRATION RECORD             ║");
        System.out.println("  ╚═══════════════════════════════════════════╝\n");


        System.out.println("\n━━━━━━━━━━━━━ TAX RECORD ━━━━━━━━━━━━━");
        System.out.println(myId +" Receipt Number: " + receiptNo);
        System.out.println(myId +" Total Tax on Record: $" + totalTax);

        System.out.println("\n━━━━━━━━━━ TAX COMPUTATION ━━━━━━━━━━");
        System.out.println(myId + " Salary: $" + getSalary());
        System.out.println(myId +" Tax Rate: " + (getRate() * 100) + "%");
        System.out.println(myId +" Gross Tax: $" + (getSalary() * getRate()));
        System.out.println(myId +" Tax Credits: $50.00");
        System.out.println("─────────────────────────────────────────");
        System.out.println(myId +" COMPUTED TAX: $" + String.format("%.2f", computeTax()));
        System.out.println("═════════════════════════════════════════\n");
    }
}
