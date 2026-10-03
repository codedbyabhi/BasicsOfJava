package com.nit.typesOfClasses;
import java.util.*;

public class ParkingApp {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String mallName=ss.nextLine();
        int totalSlots =  ss.nextInt();
        int occupiedSlots = ss.nextInt();

        ParkingLot
        
    }
}
class ParkingLot{
    public String mallName;
    public int totalSlots;
    public int occupiedSlots;

    public ParkingLot(String mallName, int totalSlots, int occupiedSlots){
        this.mallName=mallName;
        this.totalSlots=totalSlots;
        this.occupiedSlots=occupiedSlots;
    }

    static class SlotCalculator{
        public static int calculateAvailableSlots(int totalSlots, int occupiedSlots){
         return totalSlots-occupiedSlots;
        }
    }
}