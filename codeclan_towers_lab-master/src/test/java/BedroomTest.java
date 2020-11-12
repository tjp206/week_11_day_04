import Hotel.Guests.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("David");
        bedroom = new Bedroom(2, 8, RoomType.DOUBLE, 100.00);
    }

    @Test
    public void canAddGuest() {
         bedroom.addGuest(guest);
         assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest("David");
        assertEquals(0, bedroom.getGuests().size());
    }
}
