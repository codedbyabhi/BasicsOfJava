
public class Qsn05 {

}
class Mobile{
	
	public String brand;
	public double price;
	public int batteryPercentage;
	public Mobile(String brand, double price, int batteryPercentage) {
		this.brand = brand;
		this.price = price;
		this.batteryPercentage = batteryPercentage;
	}
	public int chargeBattery(int amount) {
		return amount + batteryPercentage;
	}
	public int useMobile(int amount) {
		
		return ;
	}
	
	
}
