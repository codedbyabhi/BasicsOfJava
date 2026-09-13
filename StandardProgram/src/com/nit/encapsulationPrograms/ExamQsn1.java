package com.nit.encapsulationPrograms;
import java.util.*;

class Employee{
    private String employeeName;
    private double salary;

    Employee(String employeeName, double salary){
        this.employeeName=employeeName;
        this.salary=salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid Salary");
        }
    }
}
public class ExamQsn1{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String employeeName = sc.nextLine();
        double salary = sc.nextDouble();
        double percentage = sc.nextDouble();

        Employee e = new Employee(employeeName, salary);
        
        System.out.println("Employee Name: "+e.getEmployeeName());
        System.out.println("Original Salary: "+e.getSalary());

        if(percentage<=0){
             System.out.println("Invalid Salary");
             System.out.println("Current Salary: "+e.getSalary());
        }
        else{
            e.setSalary(percentage);
            System.out.println("Updated Salary: "+e.getSalary());
        }
    }
}