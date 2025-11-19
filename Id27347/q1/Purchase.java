package Id27347.q1;

import java.time.LocalDate;

public class Purchase extends StockItem {
    private LocalDate purchaseDate;
    private int purchasedQuantity;
    private String supplierName;


    public Purchase(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, int unitPrice, int stockLimit, int qualityAvailable, int reorderLevel, LocalDate purchaseDate, int purchasedQuantity, String supplierName1) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, qualityAvailable, reorderLevel);
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName1;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        if (purchaseDate == null) throw new IllegalArgumentException("Purchase date cannot be null");
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("Purchased quantity must be > 0");
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
