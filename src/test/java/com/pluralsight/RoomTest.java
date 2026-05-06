package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_shouldOccupyAndDirtyRoom_whenRoomIsAvailable() {

        Room room = new Room(2, 124.00, false, false);

        boolean result = room.checkIn();

        assertTrue(result);
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    public void checkIn_shouldFail_whenRoomIsOccupied() {

        Room room = new Room(2, 124.00, true, false);

        boolean result = room.checkIn();

        assertFalse(result);
    }

    @Test
    public void checkIn_shouldFail_whenRoomIsDirty() {

        Room room = new Room(2, 124.00, false, true);

        boolean result = room.checkIn();

        assertFalse(result);
    }

    @Test
    public void checkout_shouldMakeRoomNotOccupied() {

        Room room = new Room(2, 124.00, true, true);

        room.checkout();

        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_shouldMakeRoomClean_whenNotOccupied() {

        Room room = new Room(2, 124.00, false, true);

        boolean result = room.cleanRoom();

        assertTrue(result);
        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoom_shouldFail_whenOccupied() {

        Room room = new Room(2, 124.00, true, true);

        boolean result = room.cleanRoom();

        assertFalse(result);
    }
}