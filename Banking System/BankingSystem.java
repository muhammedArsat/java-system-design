import java.util.*;
public class BankingSystem {

    public static void main(String[] args) {
        //data structures to store users and banlCustomers
        List<User> users = new ArrayList<>();
        List<BankCustomer> bankCustomers = new ArrayList<>();

        //manual creation of user
        users.add(new User("Arsath", "123456789", "1234", 500, new Role("user"), users));

        //create instance for the manually created user
        BankCustomer newCustomer = new BankCustomer(bankCustomers,users.get(0) );
        bankCustomers.add(newCustomer);
        Scanner sc = new Scanner(System.in);

        //Banking Process Starts here
          base: while(true){
            //get card Number and Password
            System.out.println("Enter your CardNo");
            String cardNumber = sc.next();
            System.out.println("Enter Your Password");
            String userPasswrod = sc.next();

            //password checking
            if(newCustomer.checkPin(bankCustomers, cardNumber, userPasswrod))
            {
               System.out.println("Enter 1 to withdrawal");
               System.out.println("Enter 2 to Deposit");
               System.out.println("Enter 3 to Check Balance");
               System.out.println("Enter 4 to End");

               int option = sc.nextInt();

               //cases to handle particular method selected by user
               switch(option){

                case 1 :
                    System.out.println("Enter the Amount: ");
                    int requestedAmount = sc.nextInt();
                    newCustomer.withdrawal(requestedAmount);
                    break;
                case 2:
                    System.out.println("Enter the Amount to Deposit");
                    int depositMoney = sc.nextInt();
                    newCustomer.deposit(depositMoney);
                    break;
                case 3:
                    newCustomer.balance();
                    break;
                default:
                    break base;



               }

            }else{
                System.out.println("Incorrect");
                break;
            }

        }
        sc.close();

    }
}
