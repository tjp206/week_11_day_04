import Hotel.Booking;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 12, RoomType.EXEC, 100.00);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canGetNumOfNights() {
    assertEquals(3, booking.getNumOfNights());
    }

    @Test
    public void checkTotalBill() {
        assertEquals(300.00, booking.totalBill(), 0.01);
    }
}
