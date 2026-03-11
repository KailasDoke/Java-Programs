package Challenges.inheritance;

public class LibraryItems {
    private int itemId;
    private String title;
    private String author;


    public void checkout(String name) {
        System.out.println("checkout");
    }

    public void returnItems() {
        System.out.println("Returning items ");

    }


}