import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {

    private String passangerName;
    private int busNo;
    private Date date;

    public int getBusNo(){
        return busNo;
    }
    public Date getDate(){
        return date;
    }

    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Passanger Name: ");
        passangerName = sc.nextLine();
        System.out.println("Enter the Bus Number: ");
        busNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Date in this format dd-MM-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
        date = dateFormat.parse(dateInput);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean isAvailable (List<Bus> buses , List<Booking> bookings){

        int busCapacity = 0;
        for(Bus bus : buses){
            if(bus.getBusNo() == busNo){
                busCapacity = bus.getCapacity();
            }
        }

        int totalBooked = 0;
        for(Booking booking : bookings){
            if(booking.getBusNo() == busNo && booking.getDate().equals(date) )
                totalBooked++;
        }

        return totalBooked < busCapacity ? true : false;

    }



}
