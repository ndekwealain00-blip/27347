package Id27347.q5;

import java.util.Scanner;
import java.time.LocalDate;

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║  ATTENDANCE MANAGEMENT SYSTEM         ║");
            System.out.println("╚═══════════════════════════════════════╝\n");

            // Entity data
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            // Institution data
            System.out.print("Enter Institution Name: ");
            String institutionName = scanner.nextLine();
            System.out.print("Enter Institution Code (>=3 chars): ");
            String instCode = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            // Department data
            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Enter Department Head: ");
            String departmentHead = scanner.nextLine();

            // Course data
            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Enter Credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine();

            // Instructor data
            System.out.print("Enter Instructor Name: ");
            String instructorName = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter Phone (10 digits): ");
            String phone = scanner.nextLine();

            // Student data
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            // ClassSession data
            System.out.print("Enter Session Date (YYYY-MM-DD): ");
            LocalDate sessionDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Topic: ");
            String topic = scanner.nextLine();

            // AttendanceRecord data
            System.out.print("Enter Record Student ID: ");
            String recordStudentID = scanner.nextLine();
            System.out.print("Enter Session ID: ");
            String sessionID = scanner.nextLine();
            System.out.print("Enter Status (Present/Absent): ");
            String status = scanner.nextLine();

            // LeaveRequest data
            System.out.print("Enter Request Date (YYYY-MM-DD): ");
            LocalDate requestDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Reason: ");
            String reason = scanner.nextLine();
            System.out.print("Approved? (true/false): ");
            boolean approved = scanner.nextBoolean();
            scanner.nextLine();

            // AttendanceSummary data
            System.out.print("Enter Report Date (YYYY-MM-DD): ");
            LocalDate reportDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Enter Total Present: ");
            int totalPresent = scanner.nextInt();
            System.out.print("Enter Total Absent: ");
            int totalAbsent = scanner.nextInt();

            // Create AttendanceSummary object
            AttendanceSummary summary = new AttendanceSummary(
                    id, createdDate, updatedDate,
                    institutionName, instCode, address,
                    departmentName, departmentHead,
                    courseName, courseCode, credits,
                    instructorName, email, phone,
                    studentName, studentID, age,
                    sessionDate, topic,
                    recordStudentID, sessionID, status,
                    requestDate, reason, approved,
                    reportDate, totalPresent, totalAbsent
            );

            // Display summary
            summary.displaySummary();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
