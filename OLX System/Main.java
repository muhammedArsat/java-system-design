import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Customer> customersList = new ArrayList<>();
        List<Admin> adminList = new ArrayList<>();
        List<Product> productsList = new ArrayList<>();
        List<Order> ordersList = new ArrayList<>();

        customersList.add(new Customer(customersList.size()+1, "Arsath", "arsath@gmail.com", "1234"));
        adminList.add(new Admin(adminList.size()+1, "Hamsa", "hamsa@gmail.com","2345"));
        System.out.println(customersList);
        Customer customerMethod = new Customer();
        Admin adminMethod = new Admin();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 for Customer ");
            System.out.println("Enter 2 for Admin ");
            System.out.println("Enter 3 for Exit  ");
                try{
                    int user = sc.nextInt();
                    sc.nextLine();
                    //Customer Check and Customer Functionalities
                    if(user == 1){
                        System.out.println("Enter the Email: ");
                        String userEmail = sc.nextLine();
                        System.out.println("Enter the Password: ");
                        String userPassword = sc.nextLine();

                        if(customerMethod.isValidUser(customersList, userEmail, userPassword)){
                                System.out.println("Customer is Valid");
                        }else{
                            System.out.println("Customer is not Valid");
                        }

                        // Admin Check and Admin Functonalities
                    }else if(user == 2){
                        System.out.println("Enter the Email: ");
                        String userEmail = sc.nextLine();
                        System.out.println("Enter the Password: ");
                        String userPassword = sc.nextLine();

                        if(adminMethod.isValidUser(adminList, userEmail, userPassword)){
                            System.out.println("Enter 1 for Add New Product");
                            System.out.println("Enter 2 for Get All Product");
                            System.out.println("Enter 3 for Get  Product By Id");
                            System.out.println("Enter 3 for Delete  Product By Id");
                           int option = sc.nextInt();
                           sc.nextLine();
                           switch(option){
                            //Add New Product By Admin
                            case 1:
                            System.out.println("Enter Product Name");
                            String p_name = sc.nextLine();
                            System.out.println("Enter Product Price");
                            float p_price = sc.nextFloat();
                            Product.createNewProduct(productsList, p_name, p_price);
                            break;
                           }
                        }else{
                            System.out.println("Admin is Not Valid");

                        }
                        //Terminate the Application
                    }else if(user == 3){
                        System.out.println("Application Closed");
                        return;
                    }
                }catch(Exception e){
                    System.out.println("Enter Valid Number");
                    sc.nextLine();
                }




        }






























    }

}
