package com.nit.encapsulationPrograms;
import java.util.*;

class ExamQsn2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String routerName = sc.nextLine();
        String password = sc.nextLine();
        String oldPassword = sc.nextLine();
        String newPassword = sc.nextLine();

        WifiRouter w = new WifiRouter(routerName,password);
        if(password.equals(oldPassword)&&newPassword.length()>8){
            w.changePassword(oldPassword,newPassword);
        }
        else{
            System.out.println("Password Change Failed...");
        }
        w.displayRouterDetails();
    }
}
class WifiRouter{
    private String routerName;
    private String password;

    WifiRouter(String routerName, String password){
        this.routerName=routerName;
        this.password=password;
    }

    public String getRouterName(){
        return routerName;
    }
    public String getPassword(){
        return password;
    }

    public void setRounterName(String routerName){
        this.routerName=routerName;
    }
    
    public void changePassword(String password, String newPassword){
        this.password=newPassword;
        System.out.println("Password changed successfully.");
    }

    void displayRouterDetails(){
        System.out.println("Router Name: "+getRouterName());
        System.out.println("Current Password: "+getPassword());
    }
}