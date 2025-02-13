import java.util.*;
public class Book {

    private Integer bookId;
    private String bookName;
    private String isbn;
    private String author;
    private Integer total_copies;


//constructors
    public Book(Integer bookId, String bookName, String isbn, String author, Integer total_copies){
        this.bookId = bookId;
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.total_copies = total_copies;
    }



    //getter methods

    public Integer getBookId(){
        return bookId;
    }


    public String getBookName(){
        return bookName;
    }


    public String getIsbn(){
        return isbn;
    }

    public String getAuthor(){
        return author;
    }


    public int getTotalCopies(){
        return total_copies;
    }


}
