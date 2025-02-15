abstract class User{

    private int userId;
    private String email;
    private String password;


    public User(int userId, String email, String password){
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public abstract boolean authentication();
}
