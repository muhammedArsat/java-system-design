public class User {

    private Integer userId ;
    private String username;
    private String email;
    private String department;

    //consturctors
    public User(Integer userId, String username, String email , String department){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.department = department;
    }


//getter methods
    public Integer getUserId(){
        return userId;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getDepartment(){
        return department;
    }


}
