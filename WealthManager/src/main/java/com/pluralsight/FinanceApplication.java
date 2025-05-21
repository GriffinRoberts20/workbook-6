package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.ArrayList;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam","123",  12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);
        // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);
        ArrayList<Valuable> valuables=new ArrayList<>();
        valuables.add(account1);
        valuables.add(account2);
        for(Valuable v:valuables){
            if(v instanceof BankAccount bankAccount){
                System.out.println(bankAccount.getValue());
            }
        }
        System.out.println();
        Portfolio portfolio=new Portfolio("Money","Me");
        portfolio.add(new House(1999,3000,2));
        portfolio.add(new Gold(15));
        portfolio.add(new Jewelry("The One Ring",20));
        portfolio.add(new BankAccount("Me","789",1000));

        System.out.println(portfolio.getMostValuable().getClass().getSimpleName());
    }
}
