import java.util.Date;

public class Transaction {

    private String transaction_id;
    private Book book;
    private User user;
    private Date borrowedDate;
    private Date returnDate;
    private Date dueDate;

    

//constructor

    public Transaction(String transaction_id, Book book, User user, Date borrowedDate, Date returnDate, Date dueDate){
        this.transaction_id = transaction_id;
        this.book = book;
        this.user = user;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
        this.dueDate = dueDate;
    }



//getter Methods

    public String getTransactionId(){
        return transaction_id;
    }

    public Book getBook(){
        return book;
    }

    public User getUser(){
        return user;
    }

    public Date getBorrowdDate(){
        return borrowedDate;
    }

    public Date getReturnDate(){
        return returnDate;
    }

    public Date dueDate(){
        return dueDate;
    }

    public boolean isOverDue(){
        return new Date().after(dueDate) && returnDate == null;
    }
}
