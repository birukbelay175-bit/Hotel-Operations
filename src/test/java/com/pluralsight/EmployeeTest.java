package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void punchOut_shouldCalculateHoursCorrectly() {

        Employee emp = new Employee(1, "John", "IT", 20.0, 0);

        emp.punchIn(9);
        emp.punchOut(17);

        assertEquals(8, emp.getHoursWorked());
    }

    @Test
    public void totalPay_shouldIncludeOvertime() {

        Employee emp = new Employee(1, "John", "IT", 20.0, 45);

        double totalPay = emp.getTotalPay();

        assertEquals(950, totalPay);
    }
}
