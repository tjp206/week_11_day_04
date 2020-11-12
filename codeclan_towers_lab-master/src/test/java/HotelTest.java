import Hotel.Hotel;
import Hotel.Booking;
import Hotel.Rooms.Room;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Booking booking;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(2, 8, RoomType.DOUBLE, 100.00);
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void canMakeBooking() {
        Booking booking = hotel.bookRoom(bedroom, 5);
        assertEquals(8, booking.getRoom().getRoomNumber());
        assertEquals(5, booking.getNumOfNights());
    }
    
}
