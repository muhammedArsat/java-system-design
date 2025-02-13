import java.util.*;
public class BusBooking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bus> buses = new ArrayList<>();
        List<Booking>  bookings = new ArrayList<>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,2));
        buses.add(new Bus(3,false,2));


      int  userChoice = 1;
        while(userChoice == 1){
            System.out.println("Enter 1 to Booking and 2 to stop Booking");
            userChoice = sc.nextInt();
            if(userChoice == 1){

            Booking booking = new Booking();
            if(booking.isAvailable(buses,bookings)){
                bookings.add(booking);
                System.out.println("````````````````````````````````````````````Your Booking is Confirmed````````````````````````````````````````````````````````");
            }else{
                System.out.println("```````````````````````````````````Bus is Full Try another Bus or Date```````````````````````````````````````");
            }
        }
        }
        System.out.println("```````````````````````````````````````Thanks for your Booking````````````````````````````````````````````````````````````");
    }
}
