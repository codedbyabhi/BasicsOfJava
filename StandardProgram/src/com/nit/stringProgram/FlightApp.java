package com.nit.stringProgram;
import java.util.*;

public class FlightApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seatNumber1 = sc.nextLine();
        String passengerName1 = sc.nextLine();
        String travelClass1 = sc.nextLine();

        String seatNumber2 = sc.nextLine();
        String passengerName2 = sc.nextLine();
        String travelClass2 = sc.nextLine();
        
        if(seatNumber1.length() < 2 || seatNumber1.length() > 5 || seatNumber2.length() < 2 || seatNumber2.length()>5) {
        System.out.println("Error: Seat number length must be between 2 and 5");
            return;
        }
        
        FlightSeat f1 = new FlightSeat(seatNumber1, passengerName1, travelClass1);
        FlightSeat f2 = new FlightSeat(seatNumber2, passengerName2, travelClass2);

        System.out.println("Seat1 hashCode: "+f1.hashCode());
        System.out.println("Seat2 hashCode: "+f2.hashCode());

        if(f1.hashCode()==f2.hashCode()){
            System.out.println("Hash codes are equal");
        }
        else{
            System.out.println("Hash codes are different");
            return;
        
        }

    }
}
class FlightSeat{
    public String seatNumber;
    public String passengerName;
    public String travelClass;

    FlightSeat(String seatNumber, String passengerName, String travelClass){
        this.seatNumber=seatNumber;
        this.passengerName=passengerName;
        this.travelClass=travelClass;
    }

    public int hashCode(){
        return seatNumber.hashCode();
    }
}