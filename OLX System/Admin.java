import java.util.*;
public class Admin extends User {

    private String adminName;

    //constructor to create Admin
    public Admin(Integer userId, String adminName, String email,String password){
        super(userId, email,password);
        this.adminName = adminName;
    }


    public Admin(){
        super(null,null,null);
    }
    //method to check the Admin is existed or not
    public  boolean isValidUser(List<? extends User> usersList, String email, String password){
        for(User user: usersList){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
