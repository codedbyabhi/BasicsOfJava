/*You are developing a Smart Cinema Ticket Analytics System used by multiplex theaters worldwide.

Each movie show records ticket sales and ticket price.
A non-static inner class is used to calculate total revenue for a show, while a static inner class is used to classify the show’s performance based on total tickets sold.

Class Details

Create a class named MovieShow.

Data Members
String movieName // name of the movie
int ticketsSold // number of tickets sold
double ticketPrice // price per ticket

Non-Static Inner Class
Create a non-static inner class named RevenueCalculator.

Method
double calculateRevenue()
Revenue = ticketsSold × ticketPrice

Static Inner Class
Create a static inner class named ShowPerformance.

Method
static String evaluatePerformance(int ticketsSold)

Rules
ticketsSold < 50 → "Poor Response"
ticketsSold 50–149 → "Average Response"
ticketsSold ≥ 150 → "Blockbuster Response"

Main Class Details

Create a class named CinemaApp.

Inside main:
Use Scanner to read:
Movie name
Tickets sold
Ticket price

Create a MovieShow object.
Use the non-static inner class to calculate total revenue.
Use the static inner class to determine show performance.
Display movie name, revenue, and performance.*/
package com.nit.typesOfClasses;
import java.util.*;

public class CinemaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        int ticketsSold = sc.nextInt();
        double ticketPrice = sc.nextDouble();

        if(ticketPrice<0){
            System.out.println("Error: Tickets sold cannot be negative and ticket price must be greater than zero");
            System.exit(0);
        }
       
        System.out.println("Movie: "+movieName);
        MovieShow ms = new MovieShow(movieName,ticketsSold,ticketPrice);
        
        MovieShow.RevenueCalculator r = new MovieShow(movieName,ticketsSold,ticketPrice). new RevenueCalculator();
        r.calculateRevenue();
        System.out.printf("Total revenue: %.2f",r.calculateRevenue());
        System.out.println();

        MovieShow.ShowPerformance s = new MovieShow.ShowPerformance();
        System.out.println("Show performance: "+s.evaluatePerformance(ticketsSold));
        
    }
}

class MovieShow{
    public String movieName;
    public int ticketsSold;
    public double ticketPrice;

    public MovieShow(String movieName, int ticketsSold, double ticketPrice){
        this.movieName=movieName;
        this.ticketsSold=ticketsSold;
        this.ticketPrice=ticketPrice;

    }
    class RevenueCalculator{
        public double calculateRevenue(){
            double revenue = ticketsSold*ticketPrice;
            return revenue;
        }
    }
    static class ShowPerformance{
    static String evaluatePerformance(int ticketsSold){
        if(ticketsSold<=50){
            return "Poor Response";
        }
        else if(ticketsSold>50||ticketsSold<=149){
            return "Average Response";    
        }
        else {
            return "Blockbuster Response";
        }
    }
  }
}