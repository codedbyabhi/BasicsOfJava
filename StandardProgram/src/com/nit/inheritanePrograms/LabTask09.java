package com.nit.inheritanePrograms;

import java.util.*;

public class LabTask09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int serverID = sc.nextInt();
        int baseLoad = sc.nextInt();
        int maxCapacity = sc.nextInt();
        if(choice == 1)
        {
            LinuxServer server = new LinuxServer();
            server.setServerDetails(serverID, baseLoad, maxCapacity);

            server.displayServerDetails();
            System.out.println("Final CPU Load: " + server.calculateFinalLoad());
        }
        else if(choice == 2)
        {
            WindowsServer server = new WindowsServer();
            server.setServerDetails(serverID, baseLoad, maxCapacity);

            server.displayServerDetails();
            System.out.println("Final CPU Load: " + server.calculateFinalLoad());
        } 
    }
}
class BaseServer
{
    public int serverID;
    public int baseLoad;
    public int maxCapacity;

    public void setServerDetails(int serverID, int baseLoad, int maxCapacity) 
    {
        this.serverID = serverID;
        this.baseLoad = baseLoad;
        this.maxCapacity = maxCapacity;
    }
    public void displayServerDetails()
    {
        System.out.println("Server ID: "+serverID);
        System.out.println("Base Load: "+baseLoad);
        System.out.println("Max Capacity: "+maxCapacity);
    }
    public int getCurrentLoad()
    {
        return baseLoad;
    }
}
class LinuxServer extends BaseServer
{
    public int calculateFinalLoad()
    {
        int finalLoad = baseLoad - (baseLoad*10)/100;
        
        if (finalLoad > maxCapacity) 
        {
            finalLoad = maxCapacity;
        }

        return finalLoad;
    }
}
class WindowsServer extends BaseServer
{
    public int calculateFinalLoad()
    {
        int finalLoad = baseLoad + (baseLoad*5)/100;
        
        if (finalLoad > maxCapacity) 
        {
            finalLoad = maxCapacity;
        }

        return finalLoad;
    }
}