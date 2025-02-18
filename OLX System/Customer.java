import java.util.*;
public class Customer extends User {
    private User user;
    private String customerName;
    public Customer(){
        super(null,null,null);
    }
    public Customer(Integer userId, String customerName, String email, String password){
        super(userId, email,password);
        this.customerName = customerName;
    }

    //method to check the customer is existed or not
    public   boolean isValidUser(List<? extends User> usersList,String email, String password){
        for(User user : usersList){
                if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                    System.out.println(user.getEmail());
                    return true;
                }
        }
        return false;
    }
}
