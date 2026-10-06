package com.nit.objectMethods;
import java.util.*;

public class ContactApp {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc = new Scanner(System.in);
        String contactId= sc.nextLine();
        String name=sc.nextLine();
        String phoneNumber=sc.nextLine();
        String countryCode=sc.nextLine();

        if(contactId.isEmpty()||name.isEmpty()|| phoneNumber.length() != 10|| !countryCode.matches("\\+\\d+")){
            System.out.println("Error: Invalid contact details");
            System.exit(0);

        }
        Contact c = new Contact(contactId, name, phoneNumber, countryCode);
        Contact clone = c.clone();

        clone.phoneNumber = "9988776655";

        System.out.println("Original Contact: "+c.contactId+" "+c.name+" "+c.phoneNumber+" "+c.countryCode);
        System.out.println("Cloned Contact: "+clone.contactId+" "+clone.name+" "+clone.phoneNumber+" "+clone.countryCode);

    }
}
class Contact implements Cloneable{
    public String contactId;
    public String name;
    public String phoneNumber;
    public String countryCode;

    Contact(String contactId, String name, String phoneNumber, String countryCode){
        this.contactId=contactId;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.countryCode=countryCode;
    }

    public Contact clone() throws CloneNotSupportedException{
        return (Contact) super.clone();
    }
}
