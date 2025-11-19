package Id27347.q1;

import java.time.LocalDate;

public class Product extends  Supplier{
    private String productName;
    private int unitPrice;
    private int stockLimit;

    public Product(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, int unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice <= 0) throw new IllegalArgumentException("Unit price must be > 0");
        this.unitPrice = unitPrice;
    }

    public int getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0) throw new IllegalArgumentException("Stock limit must be >= 0");
        this.stockLimit = stockLimit;
    }
}

