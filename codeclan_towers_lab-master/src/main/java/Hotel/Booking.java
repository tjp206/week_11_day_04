package Hotel;

import Hotel.Rooms.Bedroom;
import Hotel.Rooms.Room;

public class Booking {

    private Bedroom bedroom;
    private int numOfNights;

    public Booking(Bedroom bedroom, int numOfNights) {
        this.bedroom = bedroom;
        this.numOfNights = numOfNights;
    }

    public Bedroom getRoom() {
        return bedroom;
    }

    public int getNumOfNights() {
        return numOfNights;
    }
    
    public double totalBill() {
        return bedroom.getNightlyRate() * this.numOfNights;
    }
            
    
    
}