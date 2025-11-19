package Id27347.q4;

import java.time.LocalDate;

public class Delivery extends PurchaseOrder {
    LocalDate deliveryDate;
    String deliveredBy;

    public Delivery(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTI, String contact, String productName, double unitPrice, int quantity, String poNumber, LocalDate orderDate, double totalAmount, LocalDate deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTI, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate == null) throw new IllegalArgumentException("Delivery date cannot be null");
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        if (deliveredBy == null || deliveredBy.isEmpty())
            throw new IllegalArgumentException("Delivered by cannot be empty");
        this.deliveredBy = deliveredBy;
    }
}
