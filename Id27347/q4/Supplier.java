package Id27347.q4;

import java.time.LocalDate;

public class Supplier extends Department {
    String supplierName;
    String supplierTIN;
    String contact;

    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierTIN() {
        return supplierTIN;
    }

    public void setSupplierTIN(String supplierTIN) {
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}"))
            throw new IllegalArgumentException("Supplier TIN must be 9 digits");
        this.supplierTIN = supplierTIN;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if (contact == null || !contact.matches("\\d{10}"))
            throw new IllegalArgumentException("Contact must be 10 digits");
        this.contact = contact;
    }
}
