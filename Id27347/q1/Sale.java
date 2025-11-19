package Id27347.q1;

import java.time.LocalDate;

public class Sale extends Purchase {
    private LocalDate saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, int unitPrice, int stockLimit, int qualityAvailable, int reorderLevel, LocalDate purchaseDate, int purchasedQuantity, String supplierName1, LocalDate saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, qualityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierName1);
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        if (saleDate == null) throw new IllegalArgumentException("Sale date cannot be null");
        this.saleDate = saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0) throw new IllegalArgumentException("Sold quantity must be > 0");
        this.soldQuantity = soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
