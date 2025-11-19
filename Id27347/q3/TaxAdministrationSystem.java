package Id27347.q3;

import java.time.LocalDate;
import java.util.Scanner;

public class TaxAdministrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║   TAX ADMINISTRATION SYSTEM           ║");
            System.out.println("╚═══════════════════════════════════════╝\n");

            // Entity data
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            // TaxAuthority data
            System.out.print("Enter Authority Name: ");
            String authorityName = scanner.nextLine();
            System.out.print("Enter Region: ");
            String region = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            // TaxCategory data
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            System.out.print("Enter Tax Rate (e.g., 0.30 for 30%): ");
            double rate = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter Category Code (>=3 chars): ");
            String code = scanner.nextLine();

            // Taxpayer data
            System.out.print("Enter Taxpayer TIN (9 digits): ");
            String tin = scanner.nextLine();
            System.out.print("Enter Taxpayer Name: ");
            String taxpayerName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            // Employer data
            System.out.print("Enter Employer Name: ");
            String employerName = scanner.nextLine();
            System.out.print("Enter Employer TIN (9 digits): ");
            String employerTIN = scanner.nextLine();
            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();

            // Employee data
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter Salary: $");
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee TIN (9 digits): ");
            String employeeTIN = scanner.nextLine();

            // TaxDeclaration data
            System.out.print("Enter Declaration Month: ");
            String declarationMonth = scanner.nextLine();
            System.out.print("Enter Total Income: $");
            double totalIncome = scanner.nextDouble();
            scanner.nextLine();

            // TaxAssessment data
            System.out.print("Enter Assessment Date (YYYY-MM-DD): ");
            LocalDate assessmentDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Assessed Tax: $");
            double assessedTax = scanner.nextDouble();
            scanner.nextLine();

            // Payment data
            System.out.print("Enter Payment Date (YYYY-MM-DD): ");
            LocalDate paymentDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Payment Amount: $");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();

            // TaxRecord data
            System.out.print("Enter Receipt Number: ");
            String receiptNo = scanner.nextLine();
            System.out.print("Enter Total Tax: $");
            double totalTax = scanner.nextDouble();

            // Create TaxRecord object
            TaxRecord record = new TaxRecord(
                    id, createdDate, updatedDate,
                    authorityName, region, email,
                    categoryName, rate, code,
                    tin, taxpayerName, address,
                    employerName, employerTIN, contact,
                    employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome,
                    assessmentDate, assessedTax,
                    paymentDate, paymentAmount,
                    receiptNo, totalTax
            );

            // Generate tax record
            record.generateTaxRecord();


        }
    }
