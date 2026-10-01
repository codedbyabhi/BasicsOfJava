package com.nit.stringProgram;
import java.util.*;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentId1=sc.nextInt();
        sc.nextLine();
        String name1=sc.nextLine();
        String course1=sc.nextLine();
        
        int studentId2=sc.nextInt();
        sc.nextLine();
        String name2=sc.nextLine();
        String course2=sc.nextLine();

        if(studentId1<0 || studentId2<0){
            System.out.println("Error: Student ID must be greater than zero");
            return;
        }
        Student s1 = new Student(studentId1, name1, course1);
        Student s2 = new Student(studentId2, name2, course2);

        if(s1.equals(s2)){
        System.out.println("Students are equal");
        }
        else
        System.out.println("Students are not equal");
    }       
}
class Student{
    public int studentId;
    public String name;
    public String course;

    Student(int studentId, String name, String course){
        this.studentId=studentId;
        this.name=name;
        this.course=course;
    }
    public boolean equals(Object obj) {
    Student other = (Student) obj;

    return studentId == other.studentId;
  }
}