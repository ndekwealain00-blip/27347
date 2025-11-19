package Id27347.q1;

import java.time.LocalDate;

public class Inventory extends Sale {
    private int totalItems;
    private int stockValue;

    public Inventory(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, int unitPrice, int stockLimit, int qualityAvailable, int reorderLevel, LocalDate purchaseDate, int purchasedQuantity, String supplierName1, LocalDate saleDate, int soldQuantity, String customerName, int totalItems, int stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, qualityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierName1, saleDate, soldQuantity, customerName);
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        if (totalItems < 0) throw new IllegalArgumentException("Total items must be >= 0");
        this.totalItems = totalItems;
    }

    public int getStockValue() {
        return stockValue;
    }

    public void setStockValue(int stockValue) {
        if (stockValue < 0) throw new IllegalArgumentException("Stock value must be >= 0");
        this.stockValue = stockValue;
    }
}
