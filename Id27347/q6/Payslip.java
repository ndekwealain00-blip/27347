package Id27347.q6;

import java.time.LocalDate;

public class Payslip extends Payroll{
    private String payslipNumber;
    private LocalDate issueDate;

    public Payslip(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, LocalDate startDate, LocalDate endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus, double grossSalary, double totalDeductions, double netSalary, String payslipNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus, grossSalary, totalDeductions, netSalary);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String getPayslipNumber() {
        return payslipNumber;
    }

    public void setPayslipNumber(String payslipNumber) {
        this.payslipNumber = payslipNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void generatePayslip() {
        // Calculate values
        double overtimePay = getOvertimeHours() * getOvertimeRate();
        double calculatedGross = getBasicPay() + getTransportAllowance() +
                getHousingAllowance() + overtimePay + getBonus();
        double calculatedDeductions = getRssbContribution() + getPayeTax() + getLoanDeduction();
        double calculatedNet = calculatedGross - calculatedDeductions;

        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║              PAYROLL MANAGEMENT SYSTEM                ║");
        System.out.println("║                   PAYSLIP - RSSB                      ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");


        System.out.println("\n━━━━━━━━━━━━━━ PAYSLIP DETAILS ━━━━━━━━━━━━━━");
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate);

        System.out.println("\n━━━━━━━━━━━━━━ SALARY BREAKDOWN ━━━━━━━━━━━━━");
        System.out.println("Basic Pay:              $" + String.format("%10.2f", getBasicPay()));
        System.out.println("Transport Allowance:    $" + String.format("%10.2f", getTransportAllowance()));
        System.out.println("Housing Allowance:      $" + String.format("%10.2f", getHousingAllowance()));
        System.out.println("Overtime Pay:           $" + String.format("%10.2f", overtimePay));
        System.out.println("Bonus:                  $" + String.format("%10.2f", getBonus()));
        System.out.println("─────────────────────────────────────────────────");
        System.out.println("GROSS SALARY:           $" + String.format("%10.2f", calculatedGross));

        System.out.println("\n━━━━━━━━━━━━━━━ DEDUCTIONS ━━━━━━━━━━━━━━━━━");
        System.out.println("RSSB Contribution (5%): $" + String.format("%10.2f", getRssbContribution()));
        System.out.println("PAYE Tax:               $" + String.format("%10.2f", getPayeTax()));
        System.out.println("Loan Deduction:         $" + String.format("%10.2f", getLoanDeduction()));
        System.out.println("─────────────────────────────────────────────────");
        System.out.println("TOTAL DEDUCTIONS:       $" + String.format("%10.2f", calculatedDeductions));

        System.out.println("\n═════════════════════════════════════════════════");
        System.out.println("NET SALARY:             $" + String.format("%10.2f", calculatedNet));
        System.out.println("═════════════════════════════════════════════════\n");
    }
}
