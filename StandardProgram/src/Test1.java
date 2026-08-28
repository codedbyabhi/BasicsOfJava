import java.util.*;

public class Test1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String name = sc.nextLine();
     double price = sc.nextDouble();
     String category = sc.nextLine();


    }
}
class Product{

    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category){
        this.name=name;
        this.price=price;
        this.category=category;
        
    }

    public void displayDetails(){

        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Category : "+category);

    }

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}
    

}
