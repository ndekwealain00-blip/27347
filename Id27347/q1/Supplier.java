package Id27347.q1;

import java.time.LocalDate;

public class Supplier extends Category{
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode);
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        if (supplierEmail == null || !supplierEmail.contains("@"))
            throw new IllegalArgumentException("Invalid email format");
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}"))
            throw new IllegalArgumentException("Supplier phone must be 10 digits");
        this.supplierPhone = supplierPhone;
    }
}
