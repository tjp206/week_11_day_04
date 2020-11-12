import Hotel.Guests.Guest;
import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(10, "The Sky Lounge");
        guest = new Guest("David");
        guest2 = new Guest("TJ");
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals("David", guest.getName());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest("TJ");
        assertEquals(0, conferenceRoom.getGuests().size());
    }
}
