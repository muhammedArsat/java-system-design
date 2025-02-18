import java.util.*;
public abstract class User {
    private Integer user_id;
    private String email;
    private String password;

    // Constructor
    public User(Integer user_id, String email, String password) {
        this.user_id = user_id;
        this.email = email;
        this.password = password;
    }

    // Getters
    public Integer getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Abstract method to validate user
    public abstract boolean isValidUser(List<? extends User> usersList, String email, String password);
}
