package Id27347.q4;

import java.time.LocalDate;

public class Inspection extends Delivery{
    String inspectorName;
    String status;
    String remarks;

    public Inspection(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTI, String contact, String productName, double unitPrice, int quantity, String poNumber, LocalDate orderDate, double totalAmount, LocalDate deliveryDate, String deliveredBy, String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTI, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || (!status.equalsIgnoreCase("Passed") && !status.equalsIgnoreCase("Failed")))
            throw new IllegalArgumentException("Status must be Passed or Failed");
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
