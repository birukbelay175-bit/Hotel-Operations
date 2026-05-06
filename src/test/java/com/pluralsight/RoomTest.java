package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_shouldOccupyAndDirtyRoom_whenRoomIsAvailable() {
Room room = new Room(2 ,124.00 ,true, false);
room.checkIn();
assertTrue(room.isOccupied());
    }
    @Test
    public void checkIn_shouldFail_ifOccupied() {
        Room room = new Room(2, 124.00, true, false);

        assertFalse(room.checkIn());
    }

    @Test
    public void checkout_shouldMakeRoomAvailable() {
        Room room = new Room(2, 124.00, true, true);

        room.checkout();

        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_shouldCleanRoom() {
        Room room = new Room(2, 124.00, false, true);

        room.cleanRoom();

        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoom_shouldFail_ifOccupied() {
        Room room = new Room(2, 124.00, true, true);

        assertFalse(room.cleanRoom());
    }
}