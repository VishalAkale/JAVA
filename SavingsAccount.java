// package Banksys;

public class SavingsAccount implements BankAccount {
    private double balance;
    
    SavingsAccount( double initialBalance)
    {
        this.balance=initialBalance;
    }
    

    @Override
    public void withdraw(double amount) {
        // TODO Auto-generated method stub
        if(amount >0 && amount<= balance)//* 
        {
            balance=balance-amount;
            System.out.println("Withdrawl Successful. Available balance:"+balance);
        }
        else
        {
            System.out.println("Invlid Account!");
        }
       
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("Deposit successful. New Balance"+balance);
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public void balanceEnquiry() {
       System.out.println("Current Balance: "+balance);
    }
    @Override
    public void createAccount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }
    
}
// ->if  account balance is 100 if we take the amount 99 which satisfy the condition that amount is>0 and less than balance
