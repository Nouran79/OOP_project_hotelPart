package HotelDetails;

import java.util.ArrayList;

public class singleRooms extends roomsForManager {
static int singleRoomNumber=0;
    public singleRooms(){
        //super();
        singleRoomNumber++;
        setRoomId(singleRoomNumber, "SR"); //sr stands for single room
        this.roomType= "single";
        this.roomLimit=1;
        this.numberOfBeds=1;
        startDateReservations=new ArrayList<>();
        endDateReservations=new ArrayList<>();
    }

    @Override
    public void addRoomTypeDetails() {
    }
    @Override
    public void editRoomTypeDetails() {
    }
}
