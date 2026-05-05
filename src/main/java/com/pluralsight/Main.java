package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // -------- ROOM TEST --------
        Room room = new Room(2, 124.00, false, false);

        System.out.println("ROOM TEST");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        System.out.println();

        // -------- RESERVATION TEST --------
        Reservation reservation = new Reservation("king", 3, true);

        System.out.println("RESERVATION TEST");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Total: $" + reservation.getReservationTotal());

        System.out.println();

        // -------- EMPLOYEE TEST --------
        Employee emp = new Employee(1, "John", "IT", 20.0, 45);

        System.out.println("EMPLOYEE TEST");
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Pay Rate: $" + emp.getPayRate());
        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());
    }
}
