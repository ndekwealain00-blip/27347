package Id27347.q5;

import java.time.LocalDate;

public class AttendanceSummary extends LeaveRequest {
    String myId = "27347";
    private LocalDate reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, LocalDate createdDate, LocalDate updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, LocalDate sessionDate, String topic, String recordStudentID, String sessionID, String status, LocalDate requestDate, String reason, boolean approved, LocalDate reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, recordStudentID, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(int totalPresent) {
        this.totalPresent = totalPresent;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public void setTotalAbsent(int totalAbsent) {
        this.totalAbsent = totalAbsent;
    }

    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        if (totalSessions == 0) return 0.0;
        return (totalPresent * 100.0) / totalSessions;
    }

    public void displaySummary() {

        System.out.println("--------ATTENDANCE MANAGEMENT SUMMARY------");



        System.out.println("\n━━━━━━━━━━ ATTENDANCE SUMMARY ━━━━━━━━━━");
        System.out.println(myId +" Report Date: " + reportDate);
        System.out.println(myId +" Total Present: " + totalPresent);
        System.out.println(myId +" Total Absent: " + totalAbsent);
        System.out.println(myId +" Total Sessions: " + (totalPresent + totalAbsent));
        System.out.println("─────────────────────────────────────────");
        System.out.println(myId +" ATTENDANCE PERCENTAGE: " + String.format("%.2f", generateSummary()) + "%");
        System.out.println("═════════════════════════════════════════\n");
    }
}
