package com.nit.inheritanePrograms;

import java.util.*;

public class LabTask08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String studentName= sc.nextLine();
        StudentDetails sd = new StudentDetails(studentName);
        sd.displayParentName();
      
        
    }
}
class Student{
    String studentName;

    Student(String studentName){
        this.studentName=studentName;
    }
}
class StudentDetails extends Student{
    String studentName;

    StudentDetails(String studentName){
            super(studentName);
            this.studentName=studentName;
    }
    void displayParentName(){
        System.out.println("Parent Name: "+studentName);
    }
}
