import java.util.*;
public class BankCustomer {

    private int id;
    User user;

//empty constructor to create object
    BankCustomer(){
    }

    //overloaded constructor to store the reference of the current User
    BankCustomer(List<BankCustomer> bankCoustomers, User user)
    {
        this.id = bankCoustomers.size()+1;
        this.user = user;

    }

    //method to check the pin and card Number
    public boolean checkPin(List<BankCustomer> bankCustomers, String cardNo, String password){

        BankCustomer currentCustomer = new BankCustomer();
        // condition to check authentication
        for(BankCustomer bankCustomer : bankCustomers){
                if(bankCustomer.user.getCardNo().equals(cardNo)){
                    currentCustomer = bankCustomer;
                    if(currentCustomer.user.getPin().equals(password))
                    {
                        return true;
                    }
                }
        }
        return false;
    }

// method to process withdrawal
    public void withdrawal(int amount){
            if(user.getBalance()> amount){
                System.out.println("``````````````````````````````````Your Amount "+amount+" is Withrawed!!```````````````````````````````````````````````");
                user.setBalance(user.getBalance() - amount);
            }
            else{
                System.out.println("Insufficient Balance");
            }

    }


    //method to deposit the amount
    public void deposit(int amount){
        user.setBalance(user.getBalance()+amount);
    }

    //method to check Balance
    public void balance(){
        System.out.println("Your Current Balance is  "+user.getBalance());
    }
}
