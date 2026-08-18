package multipleClasses;

public class Demo {
	public static int k = 100;
	public double j = 200;

	public static void main(String[] args) {
		
		System.out.println(A.x);

	}

}

class A {

	public static int x = 300;
	public double y = 400;

	public static void run() {
		System.out.println("Run fast");
	}

	public void walk() {
		System.out.println("walk slowly");
	}
}
