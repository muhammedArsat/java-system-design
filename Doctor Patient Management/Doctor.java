import java.util.*;
public class Doctor extends User {
    private String doctorName;
    private List<String> availableDates ;
    private String specalist;
    public Doctor(int userId, String email, String password, String doctorName, String availableDate, String specialist){
        super(userId, email,password);
        this.doctorName = doctorName;
        availableDates = new ArrayList<>();
        availableDates.add(availableDate);
        this.specalist = specialist;
    }


    public void createAvailableDates(String availableDate){
        if(!availableDates.contains(availableDate)){
            availableDates.add(availableDate);
            System.out.println("Available Date is Added");
        }
        else{
            System.out.println("Duplicate Entry");
        }
    }


    public boolean authentication(){
        return true;
    }

    public String getSpecialist(){
        return specalist;
    }

    public boolean isDoctorAvailable(String requiredDate){
        for(String date : availableDates){
            if(date.equals(requiredDate)){
                return true;
            }
        }
        return false;
}
}
