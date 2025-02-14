public class Role {

    private String role;
    
    Role(String role){
        this.role = role;
    }

//adding Role for the new User
    public String getRole(){
        return role;
    }
//updating  Role for the existing  User
    public void setRole(String role){
        this.role = role;
    }
}
