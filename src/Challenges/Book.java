package Challenges;

public class Book {
    static int totalNoOfBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;


    static{
        totalNoOfBooks=0;
    }

    {
        // When the object is created then the total no will become ++
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author ){
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }

    Book(String isbn){
       this(isbn, "unknown", "unknown");
   }

    static int getTotalNoOfBooks(){
       return totalNoOfBooks;
    }

    void borrowBook(){
       if(isBorrowed){
           System.out.println("Book is already borrowed");
       }else {
           this.isBorrowed = true;
       }
    }

    void returnBook(){
       if(isBorrowed){
           this.isBorrowed = false;
           System.out.println("Hope u enjoyed");
       }else{
           System.out.println("this book alread in libray");
       }
    }

    public static void main(String[] args) {

       Book B1 = new Book("123");
       Book B2 = new Book("1234");
        System.out.println(Book.getTotalNoOfBooks());
        B1.borrowBook();
        B2.borrowBook();
        B1.borrowBook();
        B1.returnBook();
        B2.returnBook();


    }

}
