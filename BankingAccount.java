
package com.mycompany.bankingaccount;


import java.io.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class BankingAccount {
    
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter ("logs.txt")))
        {
            
     //   BankAccount user = new BankAccount("rahma",1000);
        
        BankAccount.deposit(1000);
        BankAccount.getBalance();
     //   user.withdraw(200);
     //   user.displayAccountInfo();
        }catch(FileNotFoundException f){
        
        
        }
    }
}
