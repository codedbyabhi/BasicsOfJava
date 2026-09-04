package com.nit.inheritanePrograms;

import java.util.*;

public class LabTask06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int ticketId=sc.nextInt();
        sc.nextLine();
        String movieName=sc.nextLine();
        int basePrice= sc.nextInt ();

        
        if(choice == 1){
            RegularTicket r = new RegularTicket(ticketId,movieName,basePrice);
            System.out.println("Final Price: "+r.ticketPrice(choice));
            
       }
       else if(choice == 2){
            PremiumTicket p = new PremiumTicket(ticketId,movieName,basePrice);
            System.out.println("Final Price: "+p.luxuryPrice(choice));
            
       } 
       else if(choice == 3){
            IMAXTicket i = new IMAXTicket(ticketId,movieName,basePrice);
            System.out.println("Final Price: "+i.surPrice(choice));
            
       }
     
    }
}
class Ticket{
    int ticketId;
    String movieName;
    int  basePrice;

    Ticket(int ticketId, String movieName, int  basePrice){
        this.ticketId=ticketId;
        this.movieName=movieName;
        this.basePrice=basePrice;
      }
}
class RegularTicket extends Ticket{

    RegularTicket(int ticketId, String movieName,int  basePrice){
        super(ticketId,movieName,basePrice);
    }
    int  ticketPrice(int choice) 
    {

    int finalPrice = ((basePrice * 5)/100);
    finalPrice = basePrice + finalPrice;
    return finalPrice;
    
  }
}
class PremiumTicket extends Ticket{

    PremiumTicket(int ticketId, String movieName, int  basePrice){
        super(ticketId,movieName,basePrice);
    }
    int  luxuryPrice(int choice)
     {

    int finalPrice = ((basePrice * 12) / 100);
    finalPrice =  basePrice + finalPrice;
    return finalPrice ;
  }
}
class IMAXTicket extends Ticket{

    IMAXTicket(int ticketId, String movieName, int  basePrice){
        super(ticketId, movieName, basePrice);
    }
    int  surPrice(int choice)
    {

    int finalPrice= basePrice + 250;
    return finalPrice;
    }
}