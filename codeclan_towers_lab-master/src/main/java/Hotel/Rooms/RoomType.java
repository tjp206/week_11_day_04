package Hotel.Rooms;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    EXEC(2),
    FAMILY(4),
    SUITE(8);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
