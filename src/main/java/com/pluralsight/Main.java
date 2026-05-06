package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // ===== ROOM TEST =====
        Room room = new Room(2, 124.0, false, false);

        System.out.println("ROOM TEST");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        System.out.println();

        // ===== RESERVATION TEST =====
        Reservation res = new Reservation("king", 3, true);

        System.out.println("RESERVATION TEST");
        System.out.println("Room Type: " + res.getRoomType());
        System.out.println("Price per night: $" + res.getPrice());
        System.out.println("Nights: " + res.getNumberOfNights());
        System.out.println("Weekend: " + res.isWeekend());
        System.out.println("Total: $" + res.getReservationTotal());

        System.out.println();

        // ===== EMPLOYEE TEST =====
        Employee emp = new Employee(1, "John", "IT", 20.0, 0);

        emp.punchIn(9);
        emp.punchOut(17);

        System.out.println("EMPLOYEE TEST");
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());

        System.out.println();

        // ===== HOTEL TEST =====
        Hotel hotel = new Hotel("Hilton", 5, 10);

        System.out.println("HOTEL TEST");
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());

        boolean booked = hotel.bookRoom(2, true);

        System.out.println("Booking 2 suites: " + booked);
        System.out.println("Available Suites After: " + hotel.getAvailableSuites());
    }
}