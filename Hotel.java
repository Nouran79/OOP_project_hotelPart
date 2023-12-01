package HotelDetails;

import java.util.Scanner;

public  class Hotel {
    String hotelID;
    static int hotelNumber; //order of hotel openning
    String hotelName;
    int hotelRating;
    String hotelLocation;
    String contactNumber;
    boolean AquaPark;
    int totalNumberOfAvailableRooms; //calculated
    long totalProfit;

   public void assignHotelDetails(){
       System.out.println("     <<Fill these details, please.>>");
       String hotelName;
       String hotelLocation;
       String contactNumber;
       int totalAvailableRooms;
       int hotelRating;
       String aquaParkExist;
       Scanner scanner= new Scanner(System.in);
       System.out.println(" Hotel name: ");
       hotelName= scanner.next();
       System.out.println(" Hotel Location: ");
       hotelLocation= scanner.next();
       System.out.println(" Hotel Rating [1-5]: ");
       do{
           hotelRating= scanner.nextInt();
           if(hotelRating<1|| hotelRating>5){
               System.out.println("Invalid input, please enter a number from 1 to 5./n");
           }
       }while(hotelRating<1|| hotelRating>5);
       System.out.println(" Contact number: ");
       contactNumber= scanner.next();
       System.out.println("Total available rooms in this hotel: ");
       totalAvailableRooms= scanner.nextInt();
       System.out.println("Is there aqua park? Y/N ");
       do {
           aquaParkExist = scanner.next();
           if((aquaParkExist.compareTo("N")!=0)&& (aquaParkExist.compareTo("Y")!=0 )){
               System.out.println("Invalid answer, please enter again/n");
           }
       }while ((aquaParkExist.compareTo("N")!=0)&& (aquaParkExist.compareTo("Y")!=0 ));

   }
    public void assignRoomDetails(){

    }
    public void updateHotelInformation(){

    }
}
