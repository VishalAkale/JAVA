// package Banksys;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to B Bank ");
        //Choose a/c type here
        System.out.println("Please choose account type:");
        System.out.println("1.Savings Account");
        System.out.println("2.Current  Account");
        int acch=sc.nextInt();
        BankAccount account;//creating the referance of bank account
        if(acch==1)
        {
            account=new SavingsAccount(1000);//initializing the accounts with 1000 amounts here ,means creating the saving account object using the referance  of bank account 

        }
        else if(acch==2)
        {
            account=new CurrentAccount(1000);
        }
       else{
        System.out.println("Invalid Choice! ");
        sc.close();
        return;
       }
       int choice;
       do{
            //operations
            System.out.println("\n Choose an option:");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Exit");



           choice=sc.nextInt();
          switch (choice) {
            case 1:
                   System.out.println("Enter amount to withdrw:");
                   double withdrawAmount=sc.nextDouble();
                   account.withdraw(withdrawAmount);
                
                break;
             case 2:
                      System.out.println("Enter amount to Deposit:");
                      double depositAmount=sc.nextDouble();
                       account.deposit(depositAmount);
             
                break;
            case 3:
                     account.balanceEnquiry();
                     sc.close();
                     break;
            case 4:
                    System.out.println("Thank you,for using B Bank Service");
                    System.out.println("Rishta vhi purana !!!");

          
            default:
           // System.out.println("Invalid Choice! please try agin.");
                break;
          }
          
          }while(choice !=4);

       sc.close();
    
          
    }
    
}
