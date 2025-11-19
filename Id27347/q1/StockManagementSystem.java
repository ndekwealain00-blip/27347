package Id27347.q1;

import java.time.LocalDate;
import java.util.Scanner;


public class StockManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("===== STOCK MANAGEMENT SYSTEM  =====\n");

            // Entity data
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            // Warehouse data
            System.out.print("Enter Warehouse Name: ");
            String warehouseName = scanner.nextLine();
            System.out.print("Enter Location: ");
            String location = scanner.nextLine();
            System.out.print("Enter Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();

            // Category data
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            System.out.print("Enter Category Code (alphanumeric, >= 3 chars): ");
            String categoryCode = scanner.nextLine();

            // Supplier data
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            System.out.print("Enter Supplier Email: ");
            String supplierEmail = scanner.nextLine();
            System.out.print("Enter Supplier Phone (10 digits): ");
            String supplierPhone = scanner.nextLine();

            // Product data
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Unit Price: ");
            int  unitPrice = scanner.nextInt();
            System.out.print("Enter Stock Limit: ");
            int stockLimit = scanner.nextInt();

            // StockItem data
            System.out.print("Enter Quantity Available: ");
            int quantityAvailable = scanner.nextInt();
            System.out.print("Enter Reorder Level: ");
            int reorderLevel = scanner.nextInt();
            scanner.nextLine();

            // Purchase data
            System.out.print("Enter Purchase Date (YYYY-MM-DD): ");
            LocalDate purchaseDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Purchased Quantity: ");
            int purchasedQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Purchase Supplier Name: ");
            String purchaseSupplierName = scanner.nextLine();

            // Sale data
            System.out.print("Enter Sale Date (YYYY-MM-DD): ");
            LocalDate saleDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Sold Quantity: ");
            int soldQuantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            // Inventory data
            System.out.print("Enter Total Items: ");
            int totalItems = scanner.nextInt();
            System.out.print("Enter Stock Value: ");
            int stockValue = scanner.nextInt();
            scanner.nextLine();

            // StockReport data
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            LocalDate reportDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();

            // Create StockReport object
            StockReport report = new StockReport(
                    id, createdDate, updatedDate,
                    warehouseName, location, contactNumber,
                    categoryName, categoryCode,
                    supplierName, supplierEmail, supplierPhone,
                    productName, unitPrice, stockLimit,
                    quantityAvailable, reorderLevel,
                    purchaseDate, purchasedQuantity, purchaseSupplierName,
                    saleDate, soldQuantity, customerName,
                    totalItems, stockValue,
                    reportDate, remarks
            );

            // Generate report
            report.generateReport();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}