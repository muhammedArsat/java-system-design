import java.util.*;
public class LibraryManagement{

    List<Book> books;
    List<User> users;
    List <Transaction> transactions;

//constructor
    public LibraryManagement(){
        books = new ArrayList<>();
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

//adding new Book

public void addBook(String bookName, String isbn, String author,Integer total_copies){
    Integer bookId = books.size()+1;
    books.add(new Book(bookId, bookName, author, isbn, total_copies));
}

//adding new User
    public void addUser(String userName, String email, String department){
            Integer userId = users.size() + 1;
            users.add(new User(userId, userName, email,department));
    }


// get All Users
    public void getAllUsers(){
       for(User user : users){
        System.out.print(user.getUserId()+" ");
        System.out.print(user.getUsername()+" ");
        System.out.print(user.getEmail()+" ");
        System.out.println(user.getDepartment());
       }
    }

//get all books
    public void getAllBooks(){
        for(Book book: books){
            System.out.print(book.getBookId()+" ");
            System.out.print(book.getBookName()+" ");
            System.out.print(book.getAuthor()+" ");
            System.out.print(book.getIsbn()+" ");
            System.out.println(book.getTotalCopies());

        }
    }

//get book by id
    public void getBookById(int id){
        Book findBook = returnBookById(id);
        if(findBook == null){
            System.out.println("Book is Not Found");
            return;
        }
      System.out.println(findBook.getBookId()+" "+ findBook.getBookName()+" "+findBook.getIsbn()+" "+ findBook.getAuthor()+" "+findBook.getTotalCopies());
    }
    private Book returnBookById(int id){

        for(Book book : books){
            if(book.getBookId().equals(id)) return book;
        }
        return null;
    }


//get user by id
    public void getUserById(int id){
        User user = returnUserById(id);
        if(user == null){
            System.out.println("User is Not Found");
            return;
        }

        System.out.println(user.getUserId() +" " +user.getUsername()+" "+user.getEmail()+" "+user.getDepartment());
    }
    public User returnUserById(int id){
            for(User user : users){
                if(user.getUserId().equals(id)){
                        return user;
                }
            }
            return null;
    }




public void totalCopies(int id){
    Book book = returnBookById(id);
    if(book == null) {
        System.out.println("Book is Not Find");
        return;
    }
    System.out.println(book.getTotalCopies());
}


    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.addUser("Arsath", "arsath@gmail.com", "cse");
        libraryManagement.addUser("Hamsa", "hamsa@gmail.com", "cse");
        libraryManagement.addBook("The Great Gatsby", "123S", "F. Scott Fitzgerald", 5);


        libraryManagement.getAllUsers();
        libraryManagement.getAllBooks();
        libraryManagement.getBookById(1);
        libraryManagement.getUserById(3);




    }
}
