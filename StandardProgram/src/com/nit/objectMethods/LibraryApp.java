import java.util.*;

public class LibraryApp {
    public static void main(String [] args)throws CloneNotSupportedException{
        Scanner sc = new Scanner(System.in);

        String bookId = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        if(price<0){
            System.out.println("Error: Invalid book details");
            return;
        }
        Book b = new Book(bookId, title, author, price);
        Book clone = b.clone();

        clone.price +=50;
        
        System.out.print("Original Book: ");
        System.out.println(b.bookId+" "+b.title+" "+b.author+" "+b.price);
        System.out.print("Cloned Book: ");
        System.out.println(clone.bookId+" "+clone.title+" "+clone.author+" "+clone.price);

    }

}
class Book implements Cloneable{
    public String bookId;
    public String title;
    public String author;
    public double price;

    public Book(String bookId, String title, String author, double price){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.price=price;

    }

    public Book clone() throws CloneNotSupportedException{
        return (Book) super.clone();
    }
}