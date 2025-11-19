package Id27347.q4;

import java.time.LocalDate;

public class PurchaseOrder extends Product{
    String poNumber;
    LocalDate orderDate;
    double totalAmount;

    public PurchaseOrder(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTI, String contact, String productName, double unitPrice, int quantity, String poNumber, LocalDate orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTI, contact, productName, unitPrice, quantity);
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) throw new IllegalArgumentException("Total amount must be > 0");
        this.totalAmount = totalAmount;;
    }
}
