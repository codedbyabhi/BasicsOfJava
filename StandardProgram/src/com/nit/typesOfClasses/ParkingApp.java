/*You are developing a Smart Parking Slot Display System for a shopping mall.

The mall has multiple parking zones, and each zone has a fixed parking capacity.
The system should calculate available parking slots using a static nested inner class, because the calculation logic does not depend on individual objects.

Class Details

Create a class named ParkingLot.

Data Members
String mallName // name of the shopping mall
int totalSlots // total parking slots in the mall
int occupiedSlots // currently occupied slots

Static Nested Class
Create a static nested class named SlotCalculator.

Method
static int calculateAvailableSlots(int totalSlots, int occupiedSlots)
Returns the number of available slots.

Main Class Details

Create a class named ParkingApp.

Inside main:
Use Scanner to read:
Mall name
Total slots
Occupied slots

Call the static nested class method to calculate available slots.
Display mall name and available parking slots.*/
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