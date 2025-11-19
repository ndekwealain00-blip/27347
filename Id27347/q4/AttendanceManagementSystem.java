package Id27347.q4;

import java.util.Scanner;
import java.time.LocalDate;

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║  PROCUREMENT MANAGEMENT SYSTEM        ║");
            System.out.println("╚═══════════════════════════════════════╝\n");

            // Entity data
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            // Organization data
            System.out.print("Enter Organization Name: ");
            String orgName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();

            // Department data
            System.out.print("Enter Department Name: ");
            String deptName = scanner.nextLine();
            System.out.print("Enter Department Code (alphanumeric, >=3): ");
            String deptCode = scanner.nextLine();

            // Supplier data
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            System.out.print("Enter Supplier TIN (9 digits): ");
            String supplierTIN = scanner.nextLine();
            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();

            // Product data
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Unit Price: $");
            double unitPrice = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            // PurchaseOrder data
            System.out.print("Enter PO Number: ");
            String poNumber = scanner.nextLine();
            System.out.print("Enter Order Date (YYYY-MM-DD): ");
            LocalDate orderDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Total Amount: $");
            double totalAmount = scanner.nextDouble();
            scanner.nextLine();

            // Delivery data
            System.out.print("Enter Delivery Date (YYYY-MM-DD): ");
            LocalDate deliveryDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Delivered By: ");
            String deliveredBy = scanner.nextLine();

            // Inspection data
            System.out.print("Enter Inspector Name: ");
            String inspectorName = scanner.nextLine();
            System.out.print("Enter Status (Passed/Failed): ");
            String status = scanner.nextLine();
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();

            // Invoice data
            System.out.print("Enter Invoice Number: ");
            String invoiceNo = scanner.nextLine();
            System.out.print("Enter Invoice Amount: $");
            double invoiceAmount = scanner.nextDouble();
            scanner.nextLine();

            // ProcurementReport data
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            LocalDate reportDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Summary: ");
            String summary = scanner.nextLine();

            // Create ProcurementReport object
            ProcurementReport report = new ProcurementReport(
                    id, createdDate, updatedDate,
                    orgName, address, contactEmail,
                    deptName, deptCode,
                    supplierName, supplierTIN, contact,
                    productName, unitPrice, quantity,
                    poNumber, orderDate, totalAmount,
                    deliveryDate, deliveredBy,
                    inspectorName, status, remarks,
                    invoiceNo, invoiceAmount,
                    reportDate, summary
            );

            // Generate report
            report.generateReport();


    }
}
