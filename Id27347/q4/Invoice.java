package Id27347.q4;

import java.time.LocalDate;

public class Invoice extends  Inspection{
    String invoiceNo;
    double invoiceAmount;

    public Invoice(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTI, String contact, String productName, double unitPrice, int quantity, String poNumber, LocalDate orderDate, double totalAmount, LocalDate deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTI, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks);
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount <= 0) throw new IllegalArgumentException("Invoice amount must be > 0");
        this.invoiceAmount = invoiceAmount;
    }
}
