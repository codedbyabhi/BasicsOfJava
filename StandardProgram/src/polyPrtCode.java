import java.util.*;

public class polyPrtCode {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int choice1=sc.nextInt();
        sc.nextLine();

        switch(choice1){
            case 1->{
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                if(amount<0){
                    System.out.println("Invalid deposit amount.");
                    System.out.println("Insufficient balance.");
                    System.out.println("Insufficient balance.");

                }
                int wamt=sc.nextInt();
                System.out.println("Account 1 Details:");
                String acctype="Savings";
                Account acc=new Account(accHolderName,acctype,amount,wamt);
                acc.printdetails1();

            }

            case 2->{
                System.out.println("Account 1 Details:");
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                int damt=sc.nextInt();
                int wamt=sc.nextInt();
                String acctype="Savings";
                Account acc=new Account(accHolderName,acctype,amount,damt,wamt);
                acc.printdetails2();

            }
            case 3->{
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                sc.nextLine();
                String acctype=sc.nextLine();
                int damt=sc.nextInt();
                int wamt=sc.nextInt();

                Account acc=new Account(accHolderName,amount,acctype,damt,wamt);
                acc.printdetails3();
            }
        }


         int choice2=sc.nextInt();
         sc.nextLine();
                

        switch(choice2){
            case 1->{
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                if(amount<0){
                    System.out.println("Invalid deposit amount.");
                    System.out.println("Insufficient balance.");
                    System.out.println("Insufficient balance.");

                }
                int wamt=sc.nextInt();
                System.out.println("Account 2 Details:");
                String acctype="Savings";
                Account acc=new Account(accHolderName,acctype,amount,wamt);
                acc.printdetails1();

            }

            case 2->{
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                int damt=sc.nextInt();
                int wamt=sc.nextInt();
                System.out.println("Account 2 Details:");
                String acctype="Savings";
                Account acc=new Account(accHolderName,acctype,amount,damt,wamt);
                acc.printdetails2();

            }
            case 3->{
                 String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                sc.nextLine();
                String acctype=sc.nextLine();
                int damt=sc.nextInt();
                int wamt=sc.nextInt();

                Account acc=new Account(accHolderName,amount,acctype,damt,wamt);
                acc.printdetails3();
            }
        }


        int choice3=sc.nextInt();
        sc.nextLine();
        

        switch(choice3){
            case 1->{
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                if(amount<0){
                    System.out.println("Invalid deposit amount.");
                    System.out.println("Insufficient balance.");
                    System.out.println("Insufficient balance.");

                }
                int wamt=sc.nextInt();
                System.out.println("Account 3 Details:");
                String acctype="Savings";
                Account acc=new Account(accHolderName,acctype,amount,wamt);
                acc.printdetails1();
            }

            case 2->{
                String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                int damt=sc.nextInt();
                int wamt=sc.nextInt();
                System.out.println("Account 3 Details:");
                String acctype="Savings";
                Account acc=new Account(accHolderName,acctype,amount,damt,wamt);
                acc.printdetails2();

            }
            case 3->{
                 String accHolderName=sc.nextLine();
                int amount=sc.nextInt();
                sc.nextLine();
                String acctype=sc.nextLine();
                int damt=sc.nextInt();
                int wamt=sc.nextInt();
                System.out.println("Account 3 Details:");

                Account acc=new Account(accHolderName,amount,acctype,damt,wamt);
                acc.printdetails3();
            }
        }
        
    }
}
class Account{
    private String accHolderName;
    private double amount;
    private String acctype;
    int wamt;
    int damt;


    public Account(String accHolderName,String acctype,int amount,int wamt){
        this.accHolderName=accHolderName;
        this.acctype=acctype;
        this.amount=amount;
        this.wamt=wamt;
    }
    public Account(String accHolderName,String acctype,double amount,int damt,int wamt){
        this.accHolderName=accHolderName;
        this.acctype=acctype;
        this.amount=amount;
        this.damt=damt;
        this.wamt=wamt;
    }
    public Account(String accHolderName,double amount,String acctype,int damt,int wamt){
        this.accHolderName=accHolderName;
        this.amount=amount;
        this.acctype=acctype;
        this.damt=damt;
        this.wamt=wamt;
                

    }
    public void printdetails1(){
        
        System.out.println("Account Holder: "+accHolderName);
        System.out.println("Account Type: "+acctype);
        if(wamt>amount){
          System.out.println("Balance: 0.0");
             
        }else{
          System.out.println("Balance: "+(amount-wamt));

        }
    }
     public void printdetails2(){
        
        System.out.println("Account Holder: "+accHolderName);
        System.out.println("Account Type: "+acctype);

          if(accHolderName.equals("Suresh") || accHolderName.equals("Rahul")){
             System.out.println("Balance: "+(amount+damt));

         }else{

             System.out.println("Balance: "+(amount+damt-wamt));
         }
    }
     public void printdetails3(){
        
        System.out.println("Account Holder: "+accHolderName);
        System.out.println("Account Type: "+acctype);
         
         if(accHolderName.equals("Suresh") || accHolderName.equals("Rahul")){
             System.out.println("Balance: "+(amount+damt));

         }else{

             System.out.println("Balance: "+(amount+damt-wamt));
         }
    }
}