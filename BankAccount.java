package com.mycompany.bankingaccount;

public abstract class BankAccount {
    
    public String accountHolder;
    public static double balance ;
    
    public BankAccount(String s, double b){
        this.accountHolder = s;
        this.balance =b;
        
}
    
    public  static void deposit(double d){
        if(d>0){
        BankAccount.balance = d ;
        }else{
        System.out.println("Negative amounts not accepted");
        }
    }
    
    public void withdraw(double w){
        if(this.balance >= w){
        this.balance = this.balance - w;
        }else{
        System.out.println("Insufficient funds, Please check your balance and try again");
        }
    }
    
    public void displayAccountInfo(){
        System.out.println("The account holder's name: " + this.accountHolder);
        this.getBalance();
    }
    
    public static void getBalance(){
        System.out.println("Current balance: " + BankAccount.balance);
    }    
}

