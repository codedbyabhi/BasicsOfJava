
public class ConstructorChainingDemo {
	public static void main(String[] args) {

		Bhondu b = new Bhondu("Deepak", "Full Stack java", "Hydrabad");
		Deepak_Bhondu db = new Deepak_Bhondu(null, null, null, 22, 9860);
		db.display();

	}

}

class Bhondu {

	private String name;
	private String course;
	private String city;

	public Bhondu(String name, String course, String city) {

		this.name = name;
		this.course = course;
		this.city = city;
	}

	public void display() {
		System.out.println(name);
		System.out.println(course);
		System.out.println(city);

	}

}

class Deepak_Bhondu extends Bhondu {

	private int age;
	private long phoneNo;

	public Deepak_Bhondu(String name, String course, String city, int age, long phoneNo) {
		super(name, course, city);
		this.age = age;
		this.phoneNo = phoneNo;

	}

	public void display() {
		super.display();
		System.out.println(age);
		System.out.println(phoneNo);

	}

}
