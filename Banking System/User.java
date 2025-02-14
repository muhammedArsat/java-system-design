import java.util.*;
public class User {
    private int id;
    Role role;
    private String name;
    private String cardNo;
    private String pin;
    private int balance;

    User(String name, String cardNo, String pin, int balance, Role role, List<User> users){
            this.id = users.size() + 1;
            this.role = role;
            this.name = name;
            this.cardNo = cardNo;
            this.pin = pin;
            this.balance = balance;
    }

    public int getId()
    {
        return id;
    }

    public String getName(){
        return name;
    }

    public String  getCardNo(){
        return cardNo;
    }

    public String getPin(){
        return pin;
    }

    public int getBalance(){
        return balance;
    }

public void setBalance(int balance){
    this.balance = balance;
}
}
