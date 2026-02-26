package day13Abstract;
import java.util.*;

abstract class Book {
    String title;
    String author;

    

    abstract void display();
}

class MyBook extends Book {

    int price;

    MyBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class parv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        Book newBook = new MyBook(title, author, price);
        newBook.display();

        sc.close();
    }
}
