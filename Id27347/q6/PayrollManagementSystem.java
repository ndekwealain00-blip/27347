package Id27347.q6;

import java.util.Scanner;
import java.time.LocalDate;

public class PayrollManagementSystem {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("╔═══════════════════════════════════════════╗");
                System.out.println("║   PAYROLL MANAGEMENT SYSTEM (RSSB)        ║");
                System.out.println("╚═══════════════════════════════════════════╝\n");

                // Entity data
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                LocalDate createdDate = LocalDate.now();
                LocalDate updatedDate = LocalDate.now();

                // Organization data
                System.out.print("Enter Organization Name: ");
                String orgName = scanner.nextLine();
                System.out.print("Enter Organization Code (>=3 chars): ");
                String orgCode = scanner.nextLine();
                System.out.print("Enter RSSB Number (8 digits): ");
                String rssbNumber = scanner.nextLine();
                System.out.print("Enter Contact Email: ");
                String contactEmail = scanner.nextLine();

                // Department data
                System.out.print("Enter Department Name: ");
                String deptName = scanner.nextLine();
                System.out.print("Enter Department Code (>=3 chars): ");
                String deptCode = scanner.nextLine();
                System.out.print("Enter Manager Name: ");
                String managerName = scanner.nextLine();

                // Employee data
                System.out.print("Enter Employee ID (>=1000): ");
                int employeeID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Full Name: ");
                String fullName = scanner.nextLine();
                System.out.print("Enter Position: ");
                String position = scanner.nextLine();
                System.out.print("Enter Base Salary: $");
                double baseSalary = scanner.nextDouble();
                System.out.print("RSSB Registered (true/false): ");
                boolean rssbRegistered = scanner.nextBoolean();
                scanner.nextLine();

                // PayrollPeriod data
                System.out.print("Enter Month (1-12): ");
                int month = scanner.nextInt();
                System.out.print("Enter Year (>=2000): ");
                int year = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Start Date (YYYY-MM-DD): ");
                LocalDate startDate = LocalDate.parse(scanner.nextLine());
                System.out.print("Enter End Date (YYYY-MM-DD): ");
                LocalDate endDate = LocalDate.parse(scanner.nextLine());

                // SalaryStructure data
                System.out.print("Enter Basic Pay: $");
                double basicPay = scanner.nextDouble();
                System.out.print("Enter Transport Allowance: $");
                double transportAllowance = scanner.nextDouble();
                System.out.print("Enter Housing Allowance: $");
                double housingAllowance = scanner.nextDouble();

                // Deduction data (RSSB contribution auto-calculated as 5%)
                double rssbContribution = basicPay * 0.05;
                System.out.println("RSSB Contribution (5% of basic): $" + rssbContribution);
                System.out.print("Enter PAYE Tax: $");
                double payeTax = scanner.nextDouble();
                System.out.print("Enter Loan Deduction: $");
                double loanDeduction = scanner.nextDouble();

                // Allowance data
                System.out.print("Enter Overtime Hours: ");
                double overtimeHours = scanner.nextDouble();
                System.out.print("Enter Overtime Rate (per hour): $");
                double overtimeRate = scanner.nextDouble();
                System.out.print("Enter Bonus: $");
                double bonus = scanner.nextDouble();

                // Payroll data (calculations)
                double overtimePay = overtimeHours * overtimeRate;
                double grossSalary = basicPay + transportAllowance + housingAllowance + overtimePay + bonus;
                double totalDeductions = rssbContribution + payeTax + loanDeduction;
                double netSalary = grossSalary - totalDeductions;

                System.out.println("\nCalculated Gross Salary: $" + grossSalary);
                System.out.println("Calculated Total Deductions: $" + totalDeductions);
                System.out.println("Calculated Net Salary: $" + netSalary);

                scanner.nextLine();

                // Payslip data
                System.out.print("Enter Payslip Number: ");
                String payslipNumber = scanner.nextLine();
                System.out.print("Enter Issue Date (YYYY-MM-DD): ");
                LocalDate issueDate = LocalDate.parse(scanner.nextLine());

                // Create Payslip object
                Payslip payslip = new Payslip(
                        id, createdDate, updatedDate,
                        orgName, orgCode, rssbNumber, contactEmail,
                        deptName, deptCode, managerName,
                        employeeID, fullName, position, baseSalary, rssbRegistered,
                        month, year, startDate, endDate,
                        basicPay, transportAllowance, housingAllowance,
                        rssbContribution, payeTax, loanDeduction,
                        overtimeHours, overtimeRate, bonus,
                        grossSalary, totalDeductions, netSalary,
                        payslipNumber, issueDate
                );

                // Generate payslip
                payslip.generatePayslip();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            } finally {
                scanner.close();
            }
        }
}
