package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private double punchInTime;
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;

        return regularPay + overtimePay;
    }

    public void punchIn(int time) {
        punchInTime = time;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        punchInTime = now.getHour() + (now.getMinute() / 60.0);
    }

    public void punchOut(int time) {
        hoursWorked += time - punchInTime;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);
        hoursWorked += currentTime - punchInTime;
    }
}