package HotelDetails;

public abstract class RoomAbstract {
    String type;
    int numberOfAvailableRooms;
    int numberOfBeds;
    int roomLimit;
    float roomPrice;
    int[] foodBoardPrice;

    public abstract void addRoomTypeDetails();
    public abstract void editRoomTypeDetails();
}
