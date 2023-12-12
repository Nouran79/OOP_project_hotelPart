package HotelDetails;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class roomsForManager extends basicRoomDetails {
    int numberOfAvailableRooms;
    public ArrayList<LocalDate> startDateReservations;
    public ArrayList<LocalDate> endDateReservations;
    public final void setRoomId(int rNum , String rType){
        this.roomId= rType+ rNum;
    }
    public abstract void addRoomTypeDetails();
    public abstract void editRoomTypeDetails();

}
