package com.pluralsight;

public class Reservation {

    // Backing variables
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    // Getters & Setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    // Price per night (derived)
    public double getPrice() {
        double price;

        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        } else {
            price = 0; // safety
        }

        // weekend increase
        if (weekend) {
            price = price * 1.10;
        }

        return price;
    }

    // Total reservation (derived)
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}