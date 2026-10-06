/*You are developing a University Student Profile System used by international institutions.

Each student has an associated Address object.
When a student profile is cloned for scholarship evaluation or exchange programs, both the student and their address must be duplicated completely.
Any change in the cloned student’s address must not affect the original student’s address.

This requires implementing deep cloning using the clone() method.

Class Details

Create a class named Address that implements Cloneable.

Data Members
String city // student city
String country // student country

Constructor
Address(String city, String country)
Initializes all fields.

Override clone()
Return a cloned Address object using super.clone().

Create a class named StudentProfile that implements Cloneable.

Data Members
String studentId // unique student identifier
String studentName // student full name
Address address // student address reference
double gpa // student grade point average

Constructor
StudentProfile(String studentId, String studentName, Address address, double gpa)
Initializes all fields.

Override clone()

Logic
Create a shallow copy using super.clone().
Clone the Address object separately.
Assign the cloned Address to the cloned StudentProfile.
Return the deep-cloned object.

Main Class Details

Create a class named UniversityApp.

Use Scanner to read student and address details.
Create a StudentProfile object.
Clone the student profile using clone().
Modify the cloned student’s city and GPA.
Print both original and cloned student details.*/
package com.nit.objectMethods;
import java.util.*;

public class UniversityApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        String studentId =sc.nextLine();
        String studentName =sc.nextLine();
        String city =sc.nextLine();
        String contry =sc.nextLine();
        double gpa = sc.nextDouble();

        if(gpa<0){
            System.out.println("Invalid input");
            return;
        }

        Address ad = new Address(city, contry);

        StudentProfile sp = new StudentProfile(studentId, studentName, ad, gpa);

        StudentProfile clone = sp.clone();
        
        clone.address.city = "Milan";
        clone.gpa = clone.gpa + 0.5;
        
        System.out.print("Original Student: ");
        System.out.println(sp.studentId+" "+sp.studentName+" "+city+" "+contry+" "+""+sp.gpa);
        System.out.print("Cloned Student: ");
        System.out.println(sp.studentId+" "+sp.studentName+" "+clone.address.city+" "+clone.address.contry+" "+""+clone.gpa);
        
    }
}

class Address implements Cloneable{
    public String city;
    public String contry;

    public Address(String city, String contry){
        this.city=city;
        this.contry=contry;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
class StudentProfile implements Cloneable{
    public String studentId;
    public String studentName;
    public Address address;
    public double gpa;

    public StudentProfile(String studentId, String studentName, Address address, double gpa){
        this.studentId=studentId;
        this.studentName=studentName;
        this.address=address;
        this.gpa=gpa;

    }
    public StudentProfile clone() throws CloneNotSupportedException{
        StudentProfile copy = (StudentProfile) super.clone();

        copy.address = this.address.clone();

        return copy;
    }
}