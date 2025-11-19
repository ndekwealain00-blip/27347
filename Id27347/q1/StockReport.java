package Id27347.q1;

import java.time.LocalDate;

public class StockReport extends Inventory {
    String myId ="27347";
    private LocalDate reportDate;
    private String remarks;

    public StockReport(int id, LocalDate createdDate, LocalDate updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone, String productName, int unitPrice, int stockLimit, int qualityAvailable, int reorderLevel, LocalDate purchaseDate, int purchasedQuantity, String supplierName1, LocalDate saleDate, int soldQuantity, String customerName, int totalItems, int stockValue, LocalDate reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode, supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, qualityAvailable, reorderLevel, purchaseDate, purchasedQuantity, supplierName1, saleDate, soldQuantity, customerName, totalItems, stockValue);
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void generateReport(){
        System.out.println("===== STOCK REPORT =====");
        System.out.println(myId +" Report Date: " + reportDate);
        System.out.println(myId + " Remarks: " + remarks);

        System.out.println("\n--- INVENTORY SUMMARY ---");
        System.out.println(myId +" Total Items: " + getTotalItems());
        System.out.println(myId + " Stock Value: " + getStockValue());

        System.out.println("\n--- PRODUCT DETAILS ---");
        System.out.println(myId +" Product Name: " + getProductName());
        System.out.println(myId + "Unit Price: " + getUnitPrice());
        System.out.println(myId + " Stock Limit: " + getStockLimit());

        System.out.println("\n--- STOCK ITEM ---");
        System.out.println(myId + "Quantity Available: " + getQuantityAvailable());
        System.out.println("Reorder Level: " + getReorderLevel());

        System.out.println("\n--- PURCHASE DETAILS ---");
        System.out.println("Purchase Date: " + getPurchaseDate());
        System.out.println(myId +" Purchased Quantity: " + getPurchasedQuantity());

        System.out.println("\n--- SALE DETAILS ---");
        System.out.println(myId +" Sale Date: " + getSaleDate());
        System.out.println(myId +" Sold Quantity: " + getSoldQuantity());

        System.out.println("\n=== END OF REPORT ===");
    }
}
