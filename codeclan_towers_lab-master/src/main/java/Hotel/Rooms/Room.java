package Hotel.Rooms;

import Hotel.Guests.Guest;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

     public void removeGuest(String name) {
        Guest guest = null;
         for(Guest currentGuest : guests) {
             if(name == currentGuest.getName()) {
                 guest = currentGuest;
             }
         }
         this.guests.remove(guest);
     }
 }

