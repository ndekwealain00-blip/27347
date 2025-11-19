package Id27347.q4;

import java.time.LocalDate;

public class ProcurementReport extends Invoice{
    String myId = "27347";
    LocalDate reportDate;
    String summary;

    public ProcurementReport(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTI, String contact, String productName, double unitPrice, int quantity, String poNumber, LocalDate orderDate, double totalAmount, LocalDate deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, String invoiceNo, double invoiceAmount, LocalDate reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTI, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
    }


    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    public double calculateTotal() {
        return getInvoiceAmount();
    }
    public void generateReport() {

        System.out.println("------PROCUREMENT MANAGEMENT REPORT-------");



        System.out.println("\n━━━━━━━━━━━━ REPORT SUMMARY ━━━━━━━━━━━━");
        System.out.println(myId +" Report Date: " + reportDate);
        System.out.println(myId +" Summary: " + summary);

        System.out.println("\n━━━━━━━━━━━ FINANCIAL SUMMARY ━━━━━━━━━━━");
        System.out.println(myId +" Purchase Order Total: $" + getTotalAmount());
        System.out.println(myId +" Invoice Amount: $" + getInvoiceAmount());
        System.out.println(myId +" Unit Price: $" + getUnitPrice());
        System.out.println(myId +" Quantity Ordered: " + getQuantity());
        System.out.println("─────────────────────────────────────────");
        System.out.println(myId +" TOTAL CALCULATED: $" + String.format("%.2f", calculateTotal()));
        System.out.println("═════════════════════════════════════════\n");
    }

}
